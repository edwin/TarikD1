TarikDA1
===========
A simple Java crawler to get KPU **DA1** Results, inspired from Henry Tan's [Pilpres2014] (https://github.com/ht4n/Pilpres2014). 

#####Differences
- DA1 Data is from SubDistricts to Villages.
- DB1 Data is from Regencies to SubDistricts.
- DC1 Data is from Province to Regencies. 

Tools
-------------------
* IDE - Netbeans 8.0
* DB - MySQL
* Framework - MyBatis
* Tools - JSoup, OpenCSV
* Build Tool - Maven

How to Build
-------------------
1. Change database connection located in Configuration.xml      
2. Make sure you have internet connection
3. Press F6 on Netbeans to run your application


KPU.go.id API:
     
     Province level:
     http://pilpres2014.kpu.go.id/da1.php?cmd=select&grandparent=0&parent=<Provinsi-Code>
     
     Example 1: ACEH(1)
     http://pilpres2014.kpu.go.id/da1.php?cmd=select&grandparent=0&parent=1
     
     Kabupatent level:
     grandparent=<Provinsi-Code>
     parent=<Kabupatent-Code>
     http://pilpres2014.kpu.go.id/da1.php?cmd=select&grandparent=<Provinsi-Code>&parent=<Kabupaten-Code>
     
     Example 1: BALI(53241)|TABANAN(53299)
     http://pilpres2014.kpu.go.id/da1.php?cmd=select&grandparent=53241&parent=53299
     
     
     Kecamatan level:
     grandparent=<Kabupaten-Code>
     parent=<Kecamatan-Code>
     http://pilpres2014.kpu.go.id/da1.php?cmd=select&grandparent=<Kabupaten-Code>&parent=<Kecamatan-Code>
     
     Example1: ACEH(1)|ACEH-SELATAN(2)|TRUMON(148)
     http://pilpres2014.kpu.go.id/da1.php?cmd=select&grandparent=2&parent=148
     
     Example2: BALI(53241)|JEMBRANA(53242)|MENDOYO(53256)
     http://pilpres2014.kpu.go.id/da1.php?cmd=select&grandparent=53242&parent=53256