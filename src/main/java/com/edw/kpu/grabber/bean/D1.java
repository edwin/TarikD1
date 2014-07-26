package com.edw.kpu.grabber.bean;

import java.io.Serializable;

public class D1 implements Serializable {
    private Integer id;

    private String kodeKecamatan;

    private String namaKecamatan;

    private Long suaraPrabowo;

    private Long suaraJokowi;

    private String kodeKabupaten;

    private String namaKabupaten;

    private String kodeProvinsi;

    private String namaProvinsi;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKodeKecamatan() {
        return kodeKecamatan;
    }

    public void setKodeKecamatan(String kodeKecamatan) {
        this.kodeKecamatan = kodeKecamatan;
    }

    public String getNamaKecamatan() {
        return namaKecamatan;
    }

    public void setNamaKecamatan(String namaKecamatan) {
        this.namaKecamatan = namaKecamatan;
    }

    public Long getSuaraPrabowo() {
        return suaraPrabowo;
    }

    public void setSuaraPrabowo(Long suaraPrabowo) {
        this.suaraPrabowo = suaraPrabowo;
    }

    public Long getSuaraJokowi() {
        return suaraJokowi;
    }

    public void setSuaraJokowi(Long suaraJokowi) {
        this.suaraJokowi = suaraJokowi;
    }

    public String getKodeKabupaten() {
        return kodeKabupaten;
    }

    public void setKodeKabupaten(String kodeKabupaten) {
        this.kodeKabupaten = kodeKabupaten;
    }

    public String getNamaKabupaten() {
        return namaKabupaten;
    }

    public void setNamaKabupaten(String namaKabupaten) {
        this.namaKabupaten = namaKabupaten;
    }

    public String getKodeProvinsi() {
        return kodeProvinsi;
    }

    public void setKodeProvinsi(String kodeProvinsi) {
        this.kodeProvinsi = kodeProvinsi;
    }

    public String getNamaProvinsi() {
        return namaProvinsi;
    }

    public void setNamaProvinsi(String namaProvinsi) {
        this.namaProvinsi = namaProvinsi;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        D1 other = (D1) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKodeKecamatan() == null ? other.getKodeKecamatan() == null : this.getKodeKecamatan().equals(other.getKodeKecamatan()))
            && (this.getNamaKecamatan() == null ? other.getNamaKecamatan() == null : this.getNamaKecamatan().equals(other.getNamaKecamatan()))
            && (this.getSuaraPrabowo() == null ? other.getSuaraPrabowo() == null : this.getSuaraPrabowo().equals(other.getSuaraPrabowo()))
            && (this.getSuaraJokowi() == null ? other.getSuaraJokowi() == null : this.getSuaraJokowi().equals(other.getSuaraJokowi()))
            && (this.getKodeKabupaten() == null ? other.getKodeKabupaten() == null : this.getKodeKabupaten().equals(other.getKodeKabupaten()))
            && (this.getNamaKabupaten() == null ? other.getNamaKabupaten() == null : this.getNamaKabupaten().equals(other.getNamaKabupaten()))
            && (this.getKodeProvinsi() == null ? other.getKodeProvinsi() == null : this.getKodeProvinsi().equals(other.getKodeProvinsi()))
            && (this.getNamaProvinsi() == null ? other.getNamaProvinsi() == null : this.getNamaProvinsi().equals(other.getNamaProvinsi()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKodeKecamatan() == null) ? 0 : getKodeKecamatan().hashCode());
        result = prime * result + ((getNamaKecamatan() == null) ? 0 : getNamaKecamatan().hashCode());
        result = prime * result + ((getSuaraPrabowo() == null) ? 0 : getSuaraPrabowo().hashCode());
        result = prime * result + ((getSuaraJokowi() == null) ? 0 : getSuaraJokowi().hashCode());
        result = prime * result + ((getKodeKabupaten() == null) ? 0 : getKodeKabupaten().hashCode());
        result = prime * result + ((getNamaKabupaten() == null) ? 0 : getNamaKabupaten().hashCode());
        result = prime * result + ((getKodeProvinsi() == null) ? 0 : getKodeProvinsi().hashCode());
        result = prime * result + ((getNamaProvinsi() == null) ? 0 : getNamaProvinsi().hashCode());
        return result;
    }
}