package model;

import java.time.LocalDate;

public class ChiTieu {
    private String ten;
    private LocalDate ngayChi;
    private int soTienChi;
    private String loaiChi;
    private String moTaThem;

    public ChiTieu() {
    }

    public ChiTieu(String ten, LocalDate ngayChi, int soTienChi, String loaiChi, String moTaThem) {
        this.ten = ten;
        this.ngayChi = ngayChi;
        this.soTienChi = soTienChi;
        this.loaiChi = loaiChi;
        this.moTaThem = moTaThem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgayChi() {
        return ngayChi;
    }

    public void setNgayChi(LocalDate ngayChi) {
        this.ngayChi = ngayChi;
    }

    public int getSoTienChi() {
        return soTienChi;
    }

    public void setSoTienChi(int soTienChi) {
        this.soTienChi = soTienChi;
    }

    public String getLoaiChi() {
        return loaiChi;
    }

    public void setLoaiChi(String loaiChi) {
        this.loaiChi = loaiChi;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }
}
