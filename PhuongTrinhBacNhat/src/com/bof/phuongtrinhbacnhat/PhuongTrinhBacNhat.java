package com.bof.phuongtrinhbacnhat;

public class PhuongTrinhBacNhat {
    private double a, b, x;

    public void nhapGT(double gTriA, double gTriB){
        a= gTriA;
        b= gTriB;
    }
    public void giaiPT(){
        double x= b/a;
    }
    public void inTT(){
        System.out.println("X= " + x);
    }
}
