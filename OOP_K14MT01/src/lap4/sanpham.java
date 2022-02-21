package lap4;

public class sanpham {
    String tenSp;
    double donGia;
    double giamGia;
    public String tenSp(){  
        return tenSp;
    }
    public void setTenSP(String tenSp){
        this.tenSp = tenSp;
    }
    public double setDonGia(){
        return donGia;
    }
    public void dongia(Double donGia){
        this.donGia = donGia;
    }
    public double setGiamGia(){
        return giamGia;
    }
    public void giamGia(Double giamGia){
        this.giamGia = giamGia;
    }
    public sanpham(String tenSp, Double donGia, Double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    private double getThueNhapKhau() {
        return donGia * 0.1;


        
    }
    public void xuat() {
        System.out.println("Ten San Pham:"+ tenSp);
        System.out.println("DOnGia:"+ donGia);
        System.out.println("giamGia:"+giamGia);
        System.out.println("Thue Nhap Khau:"+ getThueNhapKhau());
        return ;
        
    }
        
    }
    
       
    

