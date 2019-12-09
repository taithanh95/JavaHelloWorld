package com.bof.gallery.media;

public class Video extends Media {
	private String thoiLuong;

	public void nhapGT(String gTriID, String gTriTen, String gTriLoai, String gTriSize, String gTriThoiLuong) {

		nhapGT(gTriID, gTriTen, gTriLoai, gTriSize);
		// Gan gia tri cho thoiLuong
	}

	public void playVideo() {
		// Play Video
	}

	@Override
	protected void inTT() {
		super.inTT();
		// In them thoiLuong
	}

}