package tuan5buoi9;

import java.util.Scanner;

public class chuyenXeNgoaiThanh extends chuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;
    Scanner in = new Scanner(System.in);
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    public String getNoiDen() {
        return noiDen;
    }
    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }
    public chuyenXeNgoaiThanh(){
        super();
        this.noiDen="";
        this.soNgayDiDuoc =0;
    }
    public chuyenXeNgoaiThanh(String ma, String name,String SoXe,double DoanhThu, String noiDen ,int SoNgay){
        super(ma,name,SoXe,DoanhThu);
        this.soNgayDiDuoc=SoNgay;
        this.noiDen=noiDen;
    }
    public void nhap(){
        super.nhap();
        System.out.println("noi den:");
        this.noiDen=in.nextLine();
        System.out.println("so ngay:");
        this.soNgayDiDuoc=in.nextInt();
    }
    public String toString(){
        return "chuyenXeNgoaiThanh"+super.toString()+"\nnoiDen"+noiDen+"\nsoNgayDiDuoc"+soNgayDiDuoc+"\nDoanhThu"+this.danhThu;

    }
    
}

