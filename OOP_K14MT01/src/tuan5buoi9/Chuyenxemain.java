package tuan5buoi9;

import java.util.Scanner;

public class Chuyenxemain {
    public static void main(String[] args) {
        DanhSachChuyenXe danhSachChuyenXe = new DanhSachChuyenXe();

        //
        Scanner nhap = hoTroNhap.nhap;
        String nhapTiep = null;

        do {

            // phần dữ liệu của cha
            System.out.print("NHap ma >>:");
            String maCX = nhap.nextLine();
            System.out.print("Nhap doanh thu >>:");
            double doanhThu = nhap.nextDouble();
            // NHap ten tai xe
            // nhap so xe
            nhap.nextLine();
            System.out.print("Nhap Loai CX - Noi Thanh -1, Nogai Thanh - 2");
            int loai = nhap.nextInt();
            nhap.nextLine();

            if (loai == 1) {

                System.out.print("NHap so tuyen>>");
                int soTuyen = nhap.nextInt();
                System.out.print("NHap     So KM>>");
                float soKM = nhap.nextFloat();
                nhap.nextLine();
                chuyenXeNoiThanh chuyenXeNoiThanh = new chuyenXeNoiThanh();
                danhSachChuyenXe.them(chuyenXeNoiThanh);
                ;

            } else {

                System.out.print("NHap Noi Den>>");
                String noiDen = nhap.nextLine();
                System.out.print("NHap So NGya Di>>");
                float soNgayDi = nhap.nextFloat();
                nhap.nextLine();
                chuyenXeNgoaiThanh chuyenXeNgoaiThanh = new chuyenXeNgoaiThanh();
                danhSachChuyenXe.them(chuyenXeNgoaiThanh);
            }

            System.out.print("May co muon nhap nua khong Y/N>>");
            nhapTiep = nhap.nextLine();

        } while (nhapTiep.equals("Y"));

        //
        //

        danhSachChuyenXe.xuat();

        danhSachChuyenXe.tinhDoanhThuMoiLoai();

        System.out.println("Noi THanh" + danhSachChuyenXe.getDoanhThuNoiThanh());

        danhSachChuyenXe.demTongChuyenXe();
        System.out.println("Tong: " + danhSachChuyenXe.getDemTongCX());
    }
}
