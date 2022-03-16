package NguyenSyTien2008110080;

import java.util.Scanner;

public class CD {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private float giaThanh;
    public CD(){
        this.maCD=0;
        this.tuaCD="";
        this.caSy="";
        this.soBaiHat=0;
        this.giaThanh=0;
    }
    public CD (int maCD, String tuaCD, String caSy, int soBaiHat,float giaThanh){
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }
    public int getMaCD() {
        return maCD;
    }
    public void setMaCD(String string) {
        this.maCD = maCD;
    }
    public String getTuaCD() {
        return tuaCD;
    }
    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
    public String getCaSy() {
        return caSy;
    }
    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
    
   

    public int getSoBaiHat() {
        return soBaiHat;
    }
    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }
    public float getGiaThanh() {
        return giaThanh;
    }
    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }
    public void nhap(){
        System.out.print("Nhap ma CD: ");
       
        this.maCD = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap tua CD: ");
        this.tuaCD = scanner.nextLine();
        System.out.print("Nhap ten ca sy: ");
        this.caSy = scanner.nextLine();
        System.out.print("Nhap so bai hat: ");
        this.soBaiHat = scanner.nextInt();
        System.out.print("Nhap gia thanh: ");
        this.giaThanh = scanner.nextFloat();
        
    }
   
   
    public String toString(){
        return "CD{"+"CD"+maCD+"ten CD"+tuaCD+"ca sy"+caSy+"so bai hat"+soBaiHat+"gia thanh"+giaThanh;
    }
    
    


    
    
}
