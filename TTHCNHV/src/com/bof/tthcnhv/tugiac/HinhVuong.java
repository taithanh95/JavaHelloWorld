package com.bof.tthcnhv.tugiac;

public class HinhVuong extends TuGiac {
	private double doDaiCanh;

	public void tinhDoDaiCanh() {
		double powX = Math.pow(d1.getX() - d2.getX(), 2);
		double powY = Math.pow(d1.getY() - d2.getY(), 2);
		doDaiCanh = Math.sqrt(powX + powY);
	}

	@Override
	public void tinhChuVi() {
		chuVi = doDaiCanh * 4;
	}

	@Override
	public void tinhDienTich() {
		dienTich = doDaiCanh * doDaiCanh;

	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("Do dai canh = " + doDaiCanh);
	}

}
