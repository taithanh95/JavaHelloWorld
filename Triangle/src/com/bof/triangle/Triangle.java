package com.bof.triangle;

public class Triangle {
    private double a, b, c;
    private double chuVi, dienTich;

    public void nhapGT(double gTriA, double gTriB, double gTriC) {

        a = gTriA;
        b = gTriB;
        c = gTriC;
    }

    public void kiemTraTamGiac() {

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Day la ba canh cua mot tam giac");
        } else {
            System.out.println("Day khong phai la ba canh cua mot tam giac");
        }
    }

    public void tinhChuVi() {
        chuVi = a + b + c;

    }

    public void tinhDienTich() {
        double p = (a + b + c) / 2;
        dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void inTT() {
        System.out.println("Chu vi:" + chuVi);
        System.out.println("Dien tich" + dienTich);
    }
}
