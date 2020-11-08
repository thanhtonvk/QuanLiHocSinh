package com.tondz;

import java.util.ArrayList;

public class Lop {
    private ArrayList<Hocsinh>malop;
    private String khoa;
    private String chuyennganh;

    public ArrayList<Hocsinh> getMalop() {
        return malop;
    }

    public void setMalop(ArrayList<Hocsinh> malop) {
        this.malop = malop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public Lop(ArrayList<Hocsinh> malop, String khoa, String chuyennganh) {
        this.malop = malop;
        this.khoa = khoa;
        this.chuyennganh = chuyennganh;
    }
}

