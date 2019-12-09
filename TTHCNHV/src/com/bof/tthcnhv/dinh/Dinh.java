package com.bof.tthcnhv.dinh;

public class Dinh {
	private double x, y;

	public double getX() {

		return x;
	}

	public double getY() {

		return y;
	}

	public void nhapGT(double gTriX, double gTriY) {
		x = gTriX;
		y = gTriY;
	}

	public void inTT() {
		System.out.println("X= " + x);
		System.out.println("Y= " + y);
	}
}
