package com.bof.gallery.album;

import com.bof.gallery.media.HinhAnh;
import com.bof.gallery.media.Video;

public class AlbumMedia {
	private String maAlbum, tenAlbum, ngayTao;

	private HinhAnh dsHinhAnh[];

	private Video dsVideo[];

	public void themHinhAnh(String gTriID, String gTriTen, String gTriLoai, String gTriSize, String gTriDoPhanGiai) {
		// Tao 1 doi tuong hinhAnh
		// Sai doi tuong thuc hien nhapGT() voi cac tham so nhu tren
	}

	public void themVideo(String gTriID, String gTriTen, String gTriLoai, String gTriSize, String gTriThoiLuong) {
		// Tao 1 doi tuong video
		// Sai doi tuong thuc hien nhapGT() voi cac tham so nhu tren
	}

	public String getMaAlbum() {
		return maAlbum;
	}

	public String getTenAlbum() {
		return tenAlbum;
	}

	public void setTenAlbum(String tenAlbum) {
		// Gan gia tri cho thuoc tinh tenAlbum
		// this.tenAlbum = tenAlbum;
	}

	public void suaTenMedia(String idMedia, String tenMoi) {
		// Tim trong dsHinhAnh, neu HinhAnh nao co id = idMedia thi sai doi tuong thuc
		// hien setTen()
		// Tim trong dsVideo, neu Video nao co id = idMedia thi sai doi tuong thuc hien
		// setTen()
	}

	public void xoaMedia(int loaiMedia, String idMedia) {
		// Neu loaiMedia la 1
		// Tim trong dsHinhAnh, neu HinhAnh nao co id = idMedia thi xoa khoi dsHinhAnh
		// Neu loaiMedia la 2
		// Tim trong dsVideo, neu Video nao co id = idMedia thi xoa khoi dsVideo
	}

	public void xoaMedia(String idMedia) {
		// Tim trong dsHinhAnh, neu HinhAnh nao co id = idMedia thi xoa khoi dsHinhAnh
		// Tim trong dsVideo, neu Video nao co id = idMedia thi xoa khoi dsVideo
	}

	public void timKiemMediaTheoTen(String gTriTen) {
		// Tim kiem media theo ten trong dsHinhAnh
		// Tim kiem media theo ten trong dsVideo
		// Neu media nao co ten== gTriTen thi thuc hien inTT()
	}

	public void thuPhongHinhAnh(String idHinhAnh) {
		// Tim trong dsHinhAnh, neu HinhAnh nao co id = id thi sai HinhAnh->thuPhong()
	}

	public void xoayHinhAnh(String idHinhAnh) {
		// Tim trong dsHinhAnh, neu HinhAnh nao co id = id thi sai HinhAnh->xoay()
	}

	public void playVideo(String idVideo) {
		// Tim trong dsVideo, neu Video nao co id = id thi sai Video->playVideo()
	}

}
