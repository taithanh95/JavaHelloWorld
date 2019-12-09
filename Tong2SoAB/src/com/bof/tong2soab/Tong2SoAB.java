package com.bof.tong2soab;

public class Tong2SoAB {
	private double a, b, tong;

	public void nhapGT(double gTriA, double gTriB) {
		a = gTriA;
		b = gTriB;
	}

	public void tinhTong() {
		tong = a + b;
	}

	public void inTT() {
		System.out.println("Tong= " + tong);
	}
}
