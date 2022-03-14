package ooToan3Buoi5;

import java.util.Scanner;

import javax.print.attribute.standard.Sides;
import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class testSinhVien {
    public static void main(String[] args) {
        sinhVien sv1 = new sinhVien(1,"haha",7,6);
        sinhVien sv2 = new sinhVien(2,"hehe",8,9);

        System.out.print(sv1);
        System.out.print(sv2);
        sinhVien sv3 = new sinhVien();
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap ma sinh vien :");
        sv3.setMaSoSinhVien(nhap.nextInt());
        System.out.println("nhap ho ten :");
        sv3.setHoten(nhap.next());
        System.out.println("nhap ma sinh vien :");
        sv3.setDiemTH(nhap.nextFloat());
    }
   
   
    
    
}
