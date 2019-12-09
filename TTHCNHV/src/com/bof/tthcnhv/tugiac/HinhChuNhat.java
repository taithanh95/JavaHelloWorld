package com.bof.tthcnhv.tugiac;

public class HinhChuNhat extends TuGiac {
	private double chieuDai, chieuRong;

	private void tinhCDCR() {
		double powX = Math.pow(d1.getX() - d2.getX(), 2);
		double powY = Math.pow(d1.getY() - d2.getY(), 2);
		chieuDai = Math.sqrt(powX + powY);

		powX = Math.pow(d1.getX() - d3.getX(), 2);
		powY = Math.pow(d1.getY() - d3.getY(), 2);
		chieuRong = Math.sqrt(powX + powY);
	}

	@Override
	public void tinhChuVi() {
		chuVi = chieuDai * 2 + chieuRong * 2;

	}

	@Override
	public void tinhDienTich() {
		dienTich = chieuDai * chieuRong;

	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("Chu vi= " + chuVi);
		System.out.println("Dien tich= " + dienTich);
	}

}
