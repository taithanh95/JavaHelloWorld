package com.bof.gallery.media;

public abstract class Media {

	protected String id, ten, loai, size;

	public String getID() {
		return id;
	}

	public String getTen() {

		return ten;
	}

	public void setTen() {
		// Sua ten
	}

	public void setTen(String gTriTen) {
		// Gan gia tri cho ten
	}

	protected void nhapGT(String gTriID, String gTriTen, String gTriLoai, String gTriSize) {
		// Gan gia tri cho id, ten, loai, size
	}

	protected void inTT() {
		// In ra id, ten, loai, size
	}

}
