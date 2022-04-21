package tuan5buoi9;

import java.util.Scanner;

public class chuyenXeNoiThanh extends chuyenXe {
    private double SoKm;
    private String SoTuyen;
    Scanner in = new Scanner(System.in);
    public chuyenXeNoiThanh(){
        super();
        this.SoTuyen="";
        this.SoKm = 0;
    }
    public chuyenXeNoiThanh(String ma, String name, String SoXe, double DoanhThu,String SoTuyen,double SoKm){
        super(ma, name,SoXe,DoanhThu);
        this.SoTuyen = SoTuyen;
        this.SoKm=SoKm;
    }
    public void setSoKm(double soKm) {
        SoKm = soKm;
    }
    public double getSoKm() {
        return SoKm;
    }
    public void setSoTuyen(String soTuyen) {
        SoTuyen = soTuyen;
    }
    public String getSoTuyen() {
        return SoTuyen;
    }
    //
    public String toString(){
        return "\nchuyen xe noi thanh"+super.toString()+"\n so tuyen:"+this.SoTuyen+"\nso Km:"+this.SoKm+"\nDoanh thu:"+this.danhThu;
    }
     
}
