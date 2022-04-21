package NguyenSyTien2008110080;

import java.util.Scanner;

public class Menu {
    public Menu() {

    }

    public void menuBig(Scanner sc) {
        System.out.println();
        System.out.println("---PHAN MEN Quan Ly---");
        System.out.println("|1. Them hang hoa     |");
        System.out.println("|2. Sua, xoa hang hoa |");
        System.out.println("|3. Tim kiem hang hoa |");
        System.out.println("|4. Sap xep hang hoa  |");
        System.out.println("|5. Danh Gia  |");
        System.out.println("|6. In Danh sach      |");
        System.out.println("|7. Thoat chuong trinh|");
        System.out.print("Nhap lua chon:    ");
    }

    public void menuBai1ThemHangHoa() {
        System.out.println();
        System.out.println("--------ThemHangHoa---------");
        System.out.println("|1. Them hang dien may    |");
        System.out.println("|2. Them hang thuc pham   |");
        System.out.println("|3. Them hang sanh su     |");
        System.out.println("|4. Cap nhat lai danh sach|");
        System.out.println("|5. Quay lai menu chinh   |");
        System.out.print("Nhap lua chon cua ban: ");

    }

    public void menuBai2SuaXoaHangHoa() {
        System.out.println();
        System.out.println("-------SuaXoaHangHoa-----");
        System.out.println("|1. Sua hang hoa       |");
        System.out.println("|2. Xoa hang hoa       |");
        System.out.println("|3. Quay lai menu chinh|");
        System.out.print("Nhap lua chon cua ban: ");
    }

    public void menuBai3TimKiemHangHoa() {
        System.out.println();
        System.out.println("-----TimKiemHangHoa-----");
        System.out.println("|1. Tim Kiem theo loai |");
        System.out.println("|2. Tim kiem theo gia  |");
        System.out.println("|3. Tim kiem theo ngay |");
        System.out.println("|4. Quay lai Menu chinh|");
        System.out.print("Nhap lua chon cua ban: ");

    }
}
