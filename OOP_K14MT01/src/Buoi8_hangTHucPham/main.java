package Buoi8_hangTHucPham;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hangThucPham tp = new hangThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhập mã hàng : ");
        tp.setMaHang(scanner.nextInt());
        scanner.nextLine();
        do {
            System.out.println("Nhập tên hàng : ");
            tp.setTenHang(scanner.nextLine());
        } while (tp.kiemTraTenHang(kt));
        System.out.println("Nhập đơn giá : ");
        tp.setDonGia(scanner.nextFloat());
        do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            tp.setngaySanXuat(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.setngayHetHan(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
    }
}
