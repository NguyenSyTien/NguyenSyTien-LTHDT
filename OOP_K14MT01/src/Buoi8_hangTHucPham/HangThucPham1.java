package Buoi8_hangTHucPham;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class HangThucPham1 {
    private String maHang;
    String tenHang;
    Date ngaySX;
    Date ngayHetHan;
    float donGia;

    public HangThucPham1(String maHang){
        this.setMaHang(maHang);
    }

    public HangThucPham1(String maHang, String tenHang, Date ngaySX, Date ngayHetHan, float donGia){
        this(maHang);
        setTenHang(tenHang);
        setNgaySX(ngaySX);
        setNgayHetHan(ngayHetHan);
        setDonGia(donGia);
        
        //this.tenHang = tenHang;
    }
    
    /**
     * @param maHang the maHang to set
     */
    private void setMaHang(String maHang) {
        if(maHang != ""){
            this.maHang = maHang;
        }else{
            System.out.println("Ma hang khong duoc rong !");
        }
        
    }

    /**
     * @return the maHang
     */
    public String getMaHang() {
        return maHang;
    }

    /**
     * @param tenHang the tenHang to set
     */
    public void setTenHang(String tenHang) {
        if(tenHang != ""){
            this.tenHang = tenHang;
        }else{
            System.out.println("TEn Hang khong duoc rong !");
        }
        
    }

    /**
     * @param donGia the donGia to set
     */
    public void setDonGia(float donGia) {
        if(donGia !=0){
            this.donGia = donGia;
        }else{
            System.out.println("Don Gia khong duoc = 0 !!!");
        }
        
    }

    /**
     * @param ngayHetHan the ngayHetHan to set
     */
    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan.after(this.ngaySX)){
            this.ngayHetHan = ngayHetHan;
        }else{
            System.out.println("Ngay het han phai sau ngay san xuat");
        }
        
    }

    /**
     * @param ngaySX the ngaySX to set
     */
    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    boolean kiemTraHetHan(){
        boolean isHetHan = false;//con han
        Date hienTai = new Date(0);//ngay HIen tai
        if(this.ngayHetHan.before(hienTai)){
            isHetHan = true;
        }else{
            isHetHan = false;
        }

        return isHetHan;

    }

    public String toString(){
        String str = "Ma Hang: " + this.maHang + " Ten Hang: " + this.tenHang;
        SimpleDateFormat ngayViet = new SimpleDateFormat("dd/mm/yyyy");
        
        str += " Ngay SX: " + ngayViet.format(this.ngaySX);

        str += " Ngay Het Han: " + ngayViet.format(this.ngayHetHan);

        str += " Don Gia: " + this.donGia;

        return str;
    }
}
