package com.bof.triangle.main;

import com.bof.triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle kt = new Triangle();
        kt.nhapGT(3, 4, 5);
        kt.kiemTraTamGiac();
        kt.tinhChuVi();
        kt.tinhDienTich();
        kt.inTT();
    }
}
