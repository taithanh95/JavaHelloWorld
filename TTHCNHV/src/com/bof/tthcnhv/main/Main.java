package com.bof.tthcnhv.main;

import com.bof.tthcnhv.dinh.Dinh;
import com.bof.tthcnhv.tugiac.HinhVuong;

public class Main {
	public static void main(String[] args) {
		Dinh d1 = new Dinh();
		d1.nhapGT(0, 0);
		Dinh d2 = new Dinh();
		d2.nhapGT(0, 5);
		Dinh d3 = new Dinh();
		d3.nhapGT(5, 5);
		Dinh d4 = new Dinh();
		d4.nhapGT(5, 0);

		HinhVuong hv = new HinhVuong();
		hv.nhapGT(d1, d2, d3, d4);
		hv.tinhDoDaiCanh();
		hv.tinhChuVi();
		hv.tinhDienTich();
		hv.inTT();
	}
}
