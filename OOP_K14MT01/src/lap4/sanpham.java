package lap4;

import java.util.Scanner;

public class sanpham {
   private String tenSp;
   private double donGia;
   private double giamGia;
    public void setTenSP(String tenSp){
        this.tenSp = tenSp;
    }
    public double getDonGia(){
        return donGia;
    }
    public void setDongia(Double donGia){
        this.donGia = donGia;
    }
    public double getGiamGia(){
        return giamGia;
    }
    public void setgiamGia(Double giamGia){
        this.giamGia = giamGia;
    }
    public sanpham(String sp2, int i, int j){
        this.tenSp = sp2;
        this.donGia = i;
        this.giamGia = j;
    }
    public sanpham(){

    }
    public sanpham(String tenSp, Double donGia, Double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = 0;
    }
    public sanpham(sanpham sp1, int i) {
    }
    public sanpham(sanpham sp2, int i, int j) {
    }
    private double getThueNhapKhau() {
        return donGia * 0.1;


        
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten san pham:\n");
        tenSp = scanner.nextLine();
        System.out.print("nhap don gia:\n");
        donGia = scanner.nextDouble();
        System.out.print("nhap giam gia:\n");
        giamGia = scanner.nextDouble();
        }
    public void xuat() {
        System.out.println("Ten San Pham:"+ tenSp);
        System.out.println("DOnGia:"+ donGia);
        System.out.println("giamGia:"+giamGia);
        System.out.println("Thue Nhap Khau:"+ getThueNhapKhau());
        return ;
        
    }
    public sanpham getTenSp(){  
        return this;
    }
    
}
    
       
    

