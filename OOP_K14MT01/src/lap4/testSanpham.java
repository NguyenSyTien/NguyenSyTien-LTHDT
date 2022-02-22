package lap4;



public class  testSanpham {

    private static final sanpham sp2 = null;

    public static void main(String [] args) {
    sanpham sp1 = new sanpham(sp2, 10000,3000);
    sanpham sp2 = new sanpham(sp1, 3000);
        sp1.nhap();
        
       
       
       sp2.nhap();
       sp1.xuat(); 
       sp2.xuat();
        
    }
    
    }

