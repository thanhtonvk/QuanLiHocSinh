package com.tondz;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapThongTin {
    public void NhapHocSinh(ArrayList<Hocsinh>hocsinhArrayList){
        hocsinhArrayList.add(new Hocsinh(masv(hocsinhArrayList),ten(),quequan(),ngaysinh(),socancuoc(),lop()));
    }
    //int masv, String ten, String quenquan, String ngaysinh, String socancuoc, String lop
    public static int masv(ArrayList<Hocsinh>hocsinhArrayList){
        return hocsinhArrayList.size()+1000;
        //=> 1+1000=1001
    }

    public static String lop(){
        String ten;
        while(true){
            System.out.println("Nhập lớp sinh viên: ");
            ten = scanner.nextLine();
            if(ten!="") break;
        }
        return ten;
    }

    public static String socancuoc(){
        String ten;
        while(true){
            System.out.println("Nhập số căn cước sinh viên: ");
            ten = scanner.nextLine();
            if(ten!="") break;
        }
        return ten;
    }

    public static String ngaysinh(){
        String ten;
        while(true){
            System.out.println("Nhập ngày sinh sinh viên: ");
            ten = scanner.nextLine();
            if(ten!="") break;
        }
        return ten;
    }

    static Scanner scanner = new Scanner(System.in);
    public static String ten(){
        String ten;
        while(true){
            System.out.println("Nhập tên sinh viên: ");
            ten = scanner.nextLine();
            if(ten!="") break;
        }
        return ten;
    }
    public static String quequan(){
        String ten;
        while(true){
            System.out.println("Nhập quê sinh viên: ");
            ten = scanner.nextLine();
            if(ten!="") break;
        }
        return ten;
    }

}
