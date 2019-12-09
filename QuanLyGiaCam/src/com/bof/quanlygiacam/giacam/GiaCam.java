package com.bof.quanlygiacam.giacam;

public abstract class GiaCam {
	protected String ma, loai, nguonGoc, theTrang, giong, moiTruongSong, thucAn;
	protected double canNang;
	protected int soTrung;

	public void nhapGT(String gTriMa, String gTriLoai, String gTriNguonGoc, String gTriTheTrang, String gTriGiong,
			String gTriMoiTruongSong, String gTriThucAn, double gTriCanNang) {
		ma = gTriMa;
		loai = gTriLoai;
		nguonGoc = gTriNguonGoc;
		theTrang = gTriTheTrang;
		moiTruongSong = gTriMoiTruongSong;
		giong = gTriGiong;
		thucAn = gTriThucAn;
		canNang = gTriCanNang;

	}

	public void an() {
		// In ra thong tin thuc an
	}

	protected abstract void keu();

	protected void deTrung() {
		soTrung = soTrung + 1;
	}

	protected void inTT() {
		System.out.println("Ma gia cam: " + ma);
		System.out.println("Loai gia cam: " + loai);
		System.out.println("Nguon goc: " + nguonGoc);
		System.out.println("The trang: " + theTrang);
		System.out.println("Moi truong song: " + moiTruongSong);
		System.out.println("Giong gia cam: " + giong);
		System.out.println("Thuc an: " + thucAn);
		System.out.println("Can nang: " + canNang);
		System.out.println("So trung: " + soTrung);

	}

}
