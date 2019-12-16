package com.bof.ptbachai;

public class PTBacHai {
    private double a, b, c, x1, x2, delta;

    public void nhapGT(double a0, double b0, double c0){
        a= a0;
        b= b0;
        c= c0;
    }

    public void tinhDelta(){
        delta= b*b - 4*a*c;
    }
    public void timNghiem(){
        if (delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        } else if(delta == 0){
            x1= -b/2*a;
            x1=x2;
            System.out.println("Phuong trinh co nghiem x1=x2 ="+x1);
        }else if(delta > 0){
            x1= (-b+ Math.sqrt(delta))/2*a;
            x2= (-b- Math.sqrt(delta))/2*a;
            inKQ();
        }
    }
    public void inKQ(){
        System.out.println("Nghiem so 1: "+ x1 + "\n" +"Nghiem so 2:" +x2);
    }
}
