package ooToan3Buoi5;

public class HinhChuNhat {
   
    private float dai, rong;
    public void setdai(Float dai){
        this.dai = dai;
    }
    public float getdai(){
        return  dai;
    }
    public void setrong(Float rong){
        this.rong = rong;
    }
    public float getrong(){
        return rong;
    }
    public HinhChuNhat(Float dai, Float rong){
        this.dai = dai;
        this.rong = rong;

    }
    public HinhChuNhat(){

    }
    public  float tinhDienTich(Float dai, Float rong){
        return  dai*rong;

    }
   public float tinhChuVi(float dai, float rong){
       return (dai+rong)*2;
   }
    public String toString(){
        String str = "chieu dai:"+ this.dai+"chieu rong:"+this.rong ;
        return str;
        
    }
   
   
}
