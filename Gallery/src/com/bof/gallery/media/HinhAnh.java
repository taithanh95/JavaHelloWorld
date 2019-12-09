package com.bof.gallery.media;

public class HinhAnh extends Media {
	private String doPhanGiai;

	public void nhapGT(String gTriID, String gTriTen, String gTriLoai, String gTriSize, String gTriDoPhanGiai) {

		nhapGT(gTriID, gTriTen, gTriLoai, gTriSize);
		// Gan gia tri doPhanGiai
	}

	public void thuPhong() {
		// Thu phong hinh anh
	}

	public void xoay() {
		// Xoay hinh anh
	}

	@Override
	public void inTT() {
		super.inTT();
		// In them doPhanGiai
	}

}
