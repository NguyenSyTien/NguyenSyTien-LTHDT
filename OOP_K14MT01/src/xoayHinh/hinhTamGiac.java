package xoayHinh;

public class hinhTamGiac {
   private String fileAmThanh;
   public String getFileAmNhac(){
       return fileAmThanh;
   
    }
   
    public hinhTamGiac(String fileAmThanh){
        this.fileAmThanh = fileAmThanh;
    }
void xoay(){
    System.out.println("xoay 360 do,theo kim dong ho");

}
void phatNhac(){
    System.out.println("chơi file nhac"+fileAmThanh);
}

    
}
    

