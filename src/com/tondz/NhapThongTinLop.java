package com.tondz;

import java.util.ArrayList;

public class NhapThongTinLop {
    public void NhapLop(ArrayList<Lop>lopArrayList){
        lopArrayList.add(new Lop());
    }
    public static int malop(ArrayList<Lop>lopArrayList){
        return lopArrayList.size()+101190;
    }
}
