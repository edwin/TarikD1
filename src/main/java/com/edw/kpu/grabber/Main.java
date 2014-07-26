package com.edw.kpu.grabber;

import au.com.bytecode.opencsv.CSVReader;
import com.edw.kpu.grabber.bean.D1;
import com.edw.kpu.grabber.service.D1Service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author edwin < edwinkun at gmail dot com >
 */
public class Main {

    private final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        D1Service d1Service = new D1Service();
        try {
            int a = 0;
            
            CSVReader csvReader = new CSVReader(new FileReader("AreaCodeTable.csv"));
            String[] row = null;
            String kodeProvinsi = "",
                    namaProvinsi = "",
                    kodeKabupaten = "",
                    namaKabupaten = "";

            while ((row = csvReader.readNext()) != null) {
                if (row[0].equals("0")) {
                    kodeProvinsi = row[2];
                    namaProvinsi = row[3];
                } else if (row[0].equals("1")) {
                    kodeKabupaten = row[2];
                    namaKabupaten = row[3];
                } else {
                    D1 d1 = new D1();
                    d1.setKodeKabupaten(kodeKabupaten);
                    d1.setNamaKabupaten(namaKabupaten);
                    d1.setKodeProvinsi(kodeProvinsi);
                    d1.setNamaProvinsi(namaProvinsi);

                    d1.setKodeKecamatan(row[2]);
                    d1.setNamaKecamatan(row[3]);

                    crawl(d1);
                    
                    d1Service.insert(d1);
                }
            }
            csvReader.close();
        } catch (Exception e) {
            logger.error(e, e);
        }
    }

    public static void crawl(D1 d1) {

        Document doc = Jsoup.parse(readURL("http://pilpres2014.kpu.go.id/da1.php?cmd=select&grandparent="+d1.getKodeKabupaten()+"&parent="+d1.getKodeKecamatan()+""));
        Element targetTable = doc.select("table").last();
        Elements trs = targetTable.select("tr");
        Element tdPrabowo = trs.get(3).select("td").last();
        Element tdJokowi = trs.get(4).select("td").last();
        
        d1.setSuaraPrabowo(Long.parseLong(tdPrabowo.html()));
        d1.setSuaraJokowi(Long.parseLong(tdJokowi.html()));
    }

    public static String readURL(String url) {

        String fileContents = "";
        String currentLine = "";

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            fileContents = reader.readLine();
            while (currentLine != null) {
                currentLine = reader.readLine();
                fileContents += "\n" + currentLine;
            }
            reader.close();
            reader = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.OK_OPTION);
            e.printStackTrace();

        }
        return fileContents;
    }
}
