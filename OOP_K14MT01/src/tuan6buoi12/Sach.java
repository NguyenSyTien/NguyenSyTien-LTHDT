package tuan6buoi12;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class Sach {
    private String MaSach;
    private Data NgayNhap;
    private float DonGia;
    private double SoLuong;
    private String NhaXuatBan;
    Scanner scanner = new Scanner(System.in);
    

    public void setMaSach(String maSach) {
        MaSach = maSach;
    }
    public String getMaSach() {
        return MaSach;
    }
    public void setNgayNhap(Data ngayNhap) {
        NgayNhap = ngayNhap;
    }
    public Data getNgayNhap() {
        return NgayNhap;
    }
    public void setDonGia(float donGia) {
        DonGia = donGia;
    }
    public float getDonGia() {
        return DonGia;
    }
    public void setSoLuong(double soLuong) {
        SoLuong = soLuong;
    }
    public double getSoLuong() {
        return SoLuong;
    }
    public void setNhaXuatBan(String NhaXuatBan) {
        NhaXuatBan = NhaXuatBan;
    }
    public String getNhaXuatBan() {
        return NhaXuatBan;
    }
    public Sach(){

    }
    public Sach (String MaSach, Data NgayNhap,Float DonGia,double SoLuong,String NhaXuatBan){
        this.MaSach = MaSach;
        this.NgayNhap = NgayNhap;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.NhaXuatBan = NhaXuatBan;
    }
    

    public String toString(){
        return "\nMa Sach "+ MaSach+"Ngay Nhap"+NgayNhap+"Don Gia"+DonGia+"SO luong "+SoLuong+"Nha XuatBan"+NhaXuatBan;
    }
protected double TinhTien(){
    return 0;
}
    
}
