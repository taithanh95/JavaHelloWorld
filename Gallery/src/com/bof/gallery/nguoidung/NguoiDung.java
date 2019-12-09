package com.bof.gallery.nguoidung;

import com.bof.gallery.album.AlbumMedia;
import com.bof.gallery.media.HinhAnh;
import com.bof.gallery.media.Video;

public class NguoiDung {
	private AlbumMedia dsAlbum[];

	public void taoAlbum(AlbumMedia album) {
		// Them Album vao dsAlbum
	}

	public void suaTenAlbum(String gTriMaAlbum, String tenMoi) {
		// Tim trong dsAlbum, neu Album nao co ma = gTriMaAlbum thi gan Album -> ten=
		// tenMoi
	}

	public void xoaTenAlbum(String gTriMaAlbum) {
		// Tim trong dsAlbum, neu Album nao co ma = gTriMaAlbum thi xoa khoi dsAlbum
	}

	public AlbumMedia[] timKiemAlbum(String gTriMaAlbum) {
		AlbumMedia[] dsKQ;

		// Tim trong dsAlbum, neu Album nao co ten = gTriMaAlbum thi them vao dsKQ

		return dsKQ = null;
	}

	public void themMediaVaoAlbum(String gTriMaAlbum, HinhAnh hinhAnh) {
		// Tim trong dsAlbum, neu Album nao co ma= gTriMaAlbum thi AlbumMedia ->
		// themMedia(hinhAnh)
	}

	public void themMediaVaoAlbum(String gTriMaAlbum, Video video) {
		// Tim trong dsAlbum, neu Album nao co ma= gTriMaAlbum thi AlbumMedia ->
		// themMedia(video)

	}

	public void suaTenMedia(String gTriMaAlbum, int loaiMedia, String idMedia, String tenMoi) {
		// Tim trong dsAlbum, neu Album nao co ma= gTriMaAlbum thi AlbumMedia ->
		// suaTenMedia(loaiMedia, idMedia, tenMoi)
	}

	public void xoaMedia(String gTriMaAlbum, int loaiMedia, String idMedia) {
		// Tim trong dsAlbum, neu Album nao co ma= gTriMaAlbum thi AlbumMedia ->
		// xoaMedia(loaiMedia, idMedia)
	}

	public HinhAnh[] timKiemHinhAnh(String gTriMaAlbum, String gTriTen) {
		HinhAnh[] dsKQ;
		// Tim trong dsAlbum, neu Album nao co ma= gTriMaAlbum thi AlbumMedia->
		// timKiemHinhAnh(gTriTen)
		// Sau do luu vao dsKQ

		return dsKQ = null;
	}

	public Video[] timKiemVideo(String gTriMaAlbum, String gTriTen) {
		Video[] dsKQ;
		// Tim trong dsAlbum, neu Album nao co ma= gTriMaAlbum thi AlbumMedia->
		// timKiemVideo(gTriTen)
		// Sau do luu vao dsKQ

		return dsKQ = null;
	}

	public void thuPhongHinhAnh(String gTriMaAlbum, String idHinhAnh) {
		// Tim trong dsAlbum, neu Album nao co ma= gTriMaAlbum thi AlbumMedia->
		// thuPhongHinhAnh(idHinhAnh)
	}

	public void xoayHinhAnh(String gTriMaAlbum, String idHinhAnh) {
		// Tim trong dsAlbum, neu Album nao co ma= gTriMaAlbum thi AlbumMedia->
		// xoayHinhAnh(idHinhAnh)
	}

	public void playVideo(String gTriMaAlbum, String idVideo) {
		// Tim trong dsAlbum, neu Album nao co ma= gTriMaAlbum thi AlbumMedia->
		// playVideo(idVideo)
	}

}
