package NguyenSyTien2008110080;

import java.util.Scanner;

public class Menu {
    public Menu() {

    }

    public void menuLon(Scanner sc) {
        System.out.println();
        System.out.println("---PHAN MEN BAN HANG---");
        System.out.println("|1. Them hang hoa     |");
        System.out.println("|2. Sua, xoa hang hoa |");
        System.out.println("|3. Tim kiem hang hoa |");
        System.out.println("|4. Sap xep hang hoa  |");
        System.out.println("|5. Thong ke hang hoa |");
        System.out.println("|6. In Danh sach      |");
        System.out.println("|7. Thoat chuong trinh|");
        System.out.print("Nhap lua chon:    ");
    }

    public void menuThemHangHoa() {
        System.out.println();
        System.out.println("--------ThemHangHoa---------");
        System.out.println("|1. Them hang dien may    |");
        System.out.println("|2. Them hang thuc pham   |");
        System.out.println("|3. Them hang sanh su     |");
        System.out.println("|4. Cap nhat lai danh sach|");
        System.out.println("|5. Quay lai menu chinh   |");
        System.out.print("Nhap lua chon cua ban: ");

    }

    public void menuSuaXoaHangHoa() {
        System.out.println();
        System.out.println("-------SuaXoaHangHoa-----");
        System.out.println("|1. Sua hang hoa       |");
        System.out.println("|2. Xoa hang hoa       |");
        System.out.println("|3. Quay lai menu chinh|");
        System.out.print("Nhap lua chon cua ban: ");
    }

    public void xuatToanBo() {
        System.out.println();
        System.out.println("-----Xuat Toan Bo HangHoa-----");
        System.out.println("|1. Xuat |");
        System.out.println("|2. quay lai menu |");

    }

}
