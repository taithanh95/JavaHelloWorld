package com.bof.quanlygiacam.giacam;

public class Ga extends GiaCam {
	private int soCua;

	public int getSoCua() {

		return soCua;
	}

	public void nhapGT(String gTrima, String gTriLoai, String gTriNguonGoc, String gTriTheTrang, String gTriGiong,
			String gTriMoiTruongSong, String gTriThucAn, double gTriCanNang, int gTriSoCua) {

		nhapGT(gTrima, gTriLoai, gTriNguonGoc, gTriTheTrang, gTriGiong, gTriMoiTruongSong, gTriThucAn, gTriCanNang);

		soCua= gTriSoCua;
	}

	public void boiDat() {
		// Ga ua dung mo boi dat de tim thuc an
	}

	@Override
	protected void keu() {
		// Neu la giongCai thi keu "Cuc tac"
		// Neu la giongDuc thu keu " o o o"
	}

	@Override
	protected void inTT() {
		super.inTT();
		System.out.println("So cua: "+ soCua);
	}

}
