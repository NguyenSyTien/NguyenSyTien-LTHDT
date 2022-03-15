package tuan5buoi9;

public class listChuyenXe {
    private chuyenXe[] CX = new chuyenXe[100];
    private int countCX;
    private double sum1=0, sum2=0;
    public void listCX(){
        countCX = 0;
        for(int i=0;i<100; i++)
        {
            CX[i] = new chuyenXe();


        }
    }
    public void listCX(int temp){
        if(countCX>100)
        System.out.println("khong the them du lieu!");
        else {
            if(temp==1){
                CX[countCX] = new chuyenXeNoiThanh();
                chuyenXeNoiThanh noit = new chuyenXeNoiThanh();
                noit.nhap();
                CX[countCX]=noit;
                sum1+=noit.getDanhThu();

            }
            else{
                CX[countCX]= new chuyenXeNgoaiThanh();
                chuyenXeNgoaiThanh ngoait = new chuyenXeNgoaiThanh();
                sum2+=ngoait.getDanhThu();
            }
            countCX++;
        }
    }
    public void xuattt(){
        for(int i=0 ; i<countCX;i++){
            System.out.println("------------/-----------/----------");
            System.out.println(CX[i].toString());
        }
        System.out.println("-----------Doanh Thu-------------");
        System.out.println("|chuyen xe noi thanh:"+sum1+"|");
        System.out.println("------------------------------------------");
        
    }
}
