package com.bof.quanlygiacam.giacam;

public class Vit extends GiaCam {
	private String mao;

	protected void nhapGT(String gTrima, String gTriLoai, String gTriNguonGoc, String gTriTheTrang, String gTriGiong,
			String gTriMoiTruongSong, String gTriThucAn, double gTriCanNang, String gTriMao) {

		nhapGT(gTrima, gTriLoai, gTriNguonGoc, gTriTheTrang, gTriGiong, gTriMoiTruongSong, gTriThucAn, gTriCanNang);

		mao= gTriMao;
	}

	public void boiLoi() {
		// Vit ua boi lan de tim thuc an
	}

	@Override
	protected void keu() {
		// Keu "cap cap"
	}

	@Override
	protected void inTT() {
		super.inTT();
	}

}
