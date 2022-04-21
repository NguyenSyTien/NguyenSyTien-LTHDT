package tuan5buoi9;

import java.util.Scanner;

public class chuyenXe {
    protected String maSoChuyen , hoTenTaiXe, soXe;
    protected double danhThu;
    Scanner in = new Scanner (System.in);
    protected void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
    protected String getMaSoChuyen() {
        return maSoChuyen;
    }
    protected void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }
    protected String getHoTenTaiXe() {
        return hoTenTaiXe;
    }
    protected void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    protected String getSoXe() {
        return soXe;
    }
    protected void setDanhThu(double danhThu) {
        this.danhThu = danhThu;
    }
    protected double getDanhThu() {
        return danhThu;
    }
    protected chuyenXe(){
        this.maSoChuyen="";
        this.hoTenTaiXe="";
        this.soXe ="";
        this.danhThu = 0;

    }
    protected chuyenXe (String ma,String name , String SoXe, double DoanhThu){
        this.maSoChuyen = ma;
        this.hoTenTaiXe = name;
        this.soXe = SoXe;
        this.danhThu = DoanhThu;
    }
    //protected void nhap(){
      //  System.out.println("nhap ma so chuyen xe :");
     //   this.maSoChuyen = in.nextLine();
       // System.out.println("ho ten tai xe:");
       // this.hoTenTaiXe = in.nextLine();
       // System.out.println("so xe:");
        //this.soXe = in.nextLine();
      //  System.out.println("Doanh Thu");
        //this.danhThu = in.nextDouble();
   // }
    public String toString(){
        return"\nma so chuyen " + maSoChuyen + "\nho va ten tai xe "+hoTenTaiXe+"\nso xe"+soXe;

    }
    

}

