package tuan5buoi9;

import java.util.Scanner;

import Buoi8_hangTHucPham.main;

public class quanLyChueynXe {
   public static void main(String[]arg){
       int x;
       Scanner a = new Scanner(System.in);
       listChuyenXe DSCX=new listChuyenXe();
       do
       {
        System.out.println("\n\t---------------------------------");
        System.out.println("\t0.Exit");
        System.out.println("\t1.them chuyen xe noi thanh");
        System.out.println("\t2.them chuyen xe ngoai thanh");
        System.out.println("\t3,hien thi danh muc chuyen xe");
        System.out.println("\t----------------------------------------");
        x = a.nextInt();
        switch(x){
            case 1:
            DSCX.listCX(1);
            break;
            case 2:
            DSCX.listCX(2);
            case 3:
            DSCX.xuattt();
            break;

        }

       }while(x!=0);
       System.out.println("");
    

    

       
     
        
       


       
   }
}
