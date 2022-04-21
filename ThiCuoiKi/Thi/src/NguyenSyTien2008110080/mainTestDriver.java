package NguyenSyTien2008110080;

import java.util.Scanner;

public class mainTestDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DanhSachQuanLy qlhh = new DanhSachQuanLy();
        DuLieuHangHoa dlhh = new DuLieuHangHoa();
        Menu menu = new Menu();
        qlhh = dlhh.danhSach(); // Tiếp nhận 20 dự liệu hàng hóa
        int luaChon = 0;

        do {
            menu.menuBig(input);
            luaChon = input.nextInt();
            switch (luaChon) {
                case 1:
                    int luaChonBai1 = 0;
                    do {
                        menu.menuBai1ThemHangHoa();
                        luaChonBai1 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai1) {
                            // Begin code Them hang hoa //
                            case 1: // Them hang hoa Dien tu
                                System.out.println();
                                ThemHangHoa th1 = new ThemHangHoa();
                                qlhh = th1.themHangDienTu(qlhh, input);
                                break;
                            case 2: // Them hang hoa Thuc pham
                                System.out.println();
                                ThemHangHoa th2 = new ThemHangHoa();
                                qlhh = th2.themHangThucPham(qlhh, input);
                                break;
                            case 3: // Them hang hoa Sanh Su
                                System.out.println();
                                ThemHangHoa th3 = new ThemHangHoa();
                                qlhh = th3.themHangSanhSu(qlhh, input);
                                break;
                            case 4: // Cap nhap lai danh sach
                                System.out.println();
                                qlhh.inDanhSach();
                            case 5:
                                System.out.println();
                                HangHoa th4 = new HangHoa();
                                qlhh = th4.DanhGia(qlhh, input);
                                break;
                            default:
                                System.out.println("Chon tu 1 - 5");

                        }

                    } while (luaChonBai1 >= 1 && luaChonBai1 <= 3);
                    // END CHUONG TRINH 1
                    break;

                // Chuong trinh 2
                case 2:
                    int luaChonBaii = 0;
                    do {
                        menu.menuBai2SuaXoaHangHoa();
                        SuaXoaHangHoa suaXoa = new SuaXoaHangHoa();
                        luaChonBaii = input.nextInt();
                        input.nextLine();
                        switch (luaChonBaii) {
                            case 1: // SUA HANG HOA
                                suaXoa.suaHangHoa(qlhh, input);
                                break;
                            case 2: // XOA HANG HOA
                                System.out.println();
                                suaXoa.xoaHangHoa(qlhh, input);
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Chon tu 1 - 2");

                        }
                    } while (luaChonBaii >= 1 && luaChonBaii <= 2);
                    // END CHUONG TRINH 2
                    break;

                // Chuong trinh 3
                case 3:
                    int luaChonBai3 = 0;
                    do {
                        menu.menuBai3TimKiemHangHoa();
                        TimKiemHangHoa timKiem = new TimKiemHangHoa();
                        luaChonBai3 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai3) {
                            case 1: // Tim Kiem Theo Loai
                                System.out.println();
                                timKiem.timKiemTheoLoai(qlhh, input);
                                break;
                            case 2: // Tim Kiem Theo Gia
                                System.out.println();
                                timKiem.timKiemTheoGia(qlhh, input);
                                break;
                            case 3: // Tim Kiem Theo Ngay
                                System.out.println();
                                timKiem.timKiemTheoNgay(qlhh, input);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.print("Chon tu 1 - 4");
                                break;
                        }

                    } while (luaChonBai3 >= 1 && luaChonBai3 <= 3);
                    // END CHUONG TRINH 3
                    break;
                case 4: // In danh sach hang hoa
                    System.out.println();
                    qlhh.inDanhSach();
                    break;
                case 6: // In danh sach hang hoa
                    System.out.println();
                    DuLieuHangHoa.inDanhSach();
                    qlhh.inDanhSach();
                    break;
                case 7: // Thoat Chuong Trinh
                    break;
                default:
                    System.out.println("Chon tu 1 den 7");
                    break;

            }

        } while (luaChon >= 1 && luaChon <= 6);
        System.out.println("Thoat chuong trinh....");

    }

}
