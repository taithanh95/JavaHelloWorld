package com.bof.quanlygiacam.quanly;

import com.bof.quanlygiacam.giacam.Ga;
import com.bof.quanlygiacam.giacam.Vit;

public class QuanLy {
	private Ga dsGa[];
	private Vit dsVit[];
	private String tenTrangTrai, diaChi;

	public void nhapGT(String gTriTenTrangTrai, String gTriDiaChi) {
		// Gan gia tri
	}

	void muaThemGC(Ga ga) {
		// Them ga vao dsGa
	}

	void muaThemGC(Vit vit) {
		// Them vit vao dsVit
	}

	void banGiaCam(String gTriMa) {
		// Tim trong dsGa, dsVit, neu gia cam nao co ma= gTriMa thi xoa khoi ds
	}

	public Ga[] timKiemTheoTen(String gTriTen) {
		Ga[] dsKQ = null;

		// Tim trong dsGC neu con Ga nao co ten= gTriTen va theTrang= gTriTheTrang thi
		// them vao dsKQ

		return dsKQ;
	}

	public Vit[] timKiemGC(String gTriTen, String gTriTheTrang) {
		Vit[] dsKQ;

		// Tim trong dsGC neu con Vit nao co ten= gTriTen va theTrang= gTriTheTrang thi
		// them vao dsKQ

		return dsKQ = null;
	}

	public void xemTTGiaCam(String gTriMaGC) {
		// Tim trong dsGa, dsVit, neu gia cam nao co ma= gTriMaGC thi GiaCam -> inTT
	}

	public void xemTTGiaCam() {
		// Tim trong dsGa, dsVit va goi hanh vi GiaCam -> inTT
	}

	public void inTT() {
		// In ra tenTrangTrai, diaChi
		// xemTTGiaCam
	}

}
