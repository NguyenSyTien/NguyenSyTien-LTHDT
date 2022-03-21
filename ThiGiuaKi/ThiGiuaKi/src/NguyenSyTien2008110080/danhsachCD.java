package NguyenSyTien2008110080;

public class danhsachCD {
    private CD[] CD = new CD[10];
    private int countCD;
    private double sum1 = 0, sum2 = 0;
    public void danhsachCD(){
        countCD = 0;
        for(int i = 0; i < 10; i++){
            CD[i] = new CD();
        }
    }

    public void listcd(){
        if(countCD > 10){
            System.out.println("Khong the them CD duoc!!!");
        }else{ 
            CD[countCD] = new CD();
                CD cd = new CD();
                cd.nhap();
                CD[countCD] = cd;
        countCD++;       
        }
        
    }
   
    public void tongBaihat(){
        for(int i = 0; i < countCD; i++){
            this.sum1 += CD[i].getSoBaiHat(); 
        }System.out.println("So bai hat la: "+this.sum1);
    }
    
    public void tongGiaThanhCD(){
        for(int i = 0; i < countCD; i++){
            this.sum2 += CD[i].getGiaThanh();
        }System.out.println("Tong gia CD la: "+this.sum2);
    }
  

    public void xuatDS(){
        for(int i = 0; i < countCD; i++){
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println(CD[i].toString());
        }
    }
}
