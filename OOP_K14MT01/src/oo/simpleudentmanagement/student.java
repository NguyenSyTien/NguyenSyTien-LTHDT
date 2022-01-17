package oo.simpleudentmanagement;

public class student {
    String mssv;
    String tenSinhVien;
    String lop;
    String khoa;
    String nganh;
    double diemTB;

    //method/function
    void hoc(){
        System.out.println("Hoc ...");
        //thao tac len du lieu
    }

    void thamGiaHoatDong(){
        System.out.println("Da bong ...");
    }

    void thi(){
        System.out.println("Thi ...");
    }

    void phatBieu(){
        System.out.println("Phat Bieu ...");
    }
    public student(string name, string mssv, string lop, string nghanh, double diemTB){
        this.ten = name;
        this.mssv = mssv;
        this.lop = lop;
        this.nganh = nghanh;
        this.diemTB = diemTB;



    

        }

        void show(){
            system.out.println("ma sv" + this.mssv);
            system.out.println("ten sinh vien " + this.tenSinhVien);
            System.out.println("lop "+ lop);
            system.out.println("nghanh hoc "+ this.nganh);
            system.out.println("diem trung binh"+ this.diemTB);


        }

        
    }
}
