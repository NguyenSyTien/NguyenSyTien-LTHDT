package tuan6buoi12;

import javax.management.ConstructorParameters;

public class SachGiaoKhoa {
    private boolean TinhTrang;

    public void setTinhTrang(boolean tinhTrang) {
        TinhTrang = tinhTrang;
        
    }
    public SachGiaoKhoa(){
        super();

    }
    public SachGiaoKhoa( boolean TinhTrang){
        super();

        this.TinhTrang = TinhTrang;
    }
    public String toString (){
        return "\n Sach Giao Khoa "+super.toString()+"Ma Sach"+this.
    }
    
}
