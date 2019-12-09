package com.bof.tthcnhv.tugiac;

import com.bof.tthcnhv.dinh.Dinh;

public abstract class TuGiac {

	protected double chuVi, dienTich;
	protected Dinh d1, d2, d3, d4;

	public void nhapGT(Dinh gTriD1, Dinh gTriD2, Dinh gTriD3, Dinh gTriD4) {
		d1 = gTriD1;
		d2 = gTriD2;
		d3 = gTriD3;
		d4 = gTriD4;
	}

	protected abstract void tinhChuVi();

	protected abstract void tinhDienTich();

	protected void inTT() {
		d1.inTT();
		d2.inTT();
		d3.inTT();
		d4.inTT();

		System.out.println("Chu vi= " + chuVi);
		System.out.println("Dien tich= " + dienTich);
	}

}
