package ooToan3Buoi5;
import java.util.Scanner;

public class sinhVien {
    private int maSoSinhVien;
    private String hoTen;
    private float diemLT;
   private float diemTH;
    public  sinhVien() {
 
    }
    //khởi tạo constructor có tham số
    public  sinhVien(int maSoSinhVien, String hoTen, float diemLT, float diemTH ) {
        this.maSoSinhVien = maSoSinhVien;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    //--------------begin getter and setter--------------------
    public int getMaSoSinhVien() {
        return maSoSinhVien;
    }
 
    public void setMaSoSinhVien(int maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }
 
    public String getHoten() {
        return hoTen;
    }
 
    public void setHoten(String hoten) {
        this.hoTen = hoten;
    }
 
    public float getDiemTL() {
        return diemLT;
    }
 
    public void setDiemTL(Float diemLT) {
        this.diemLT = diemLT;
    }
 
    public float getDiemTH() {
        return diemTH;
    }
 
    public void setDiemTH(Float diemTH) {
        this.diemTH = diemTH;
    }
    public float diemTB(){
        return (diemLT+diemTH)/2;
    }
    ///khởi tạo phương thức toString
    public String toString(){
        return maSoSinhVien+""+ hoTen +""+ diemLT+""+diemTH;
    }
    

   
    
}

