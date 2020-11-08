package com.tondz;

public class Hocsinh {
    private int masv;
    private String ten;
    private String quenquan;
    private String ngaysinh;
    private String socancuoc;
    private String lop;

    public Hocsinh(int masv, String ten, String quenquan, String ngaysinh, String socancuoc, String lop) {
        this.masv = masv;
        this.ten = ten;
        this.quenquan = quenquan;
        this.ngaysinh = ngaysinh;
        this.socancuoc = socancuoc;
        this.lop = lop;
    }
    @Override
    public String toString(){
        return masv+"#"+ten+"#"+quenquan+"#"+ngaysinh+"#"+socancuoc+"#"+lop;
    }
    public Hocsinh(){

    }
    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQuenquan() {
        return quenquan;
    }

    public void setQuenquan(String quenquan) {
        this.quenquan = quenquan;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSocancuoc() {
        return socancuoc;
    }

    public void setSocancuoc(String socancuoc) {
        this.socancuoc = socancuoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
