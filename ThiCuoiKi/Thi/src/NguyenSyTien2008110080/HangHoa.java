package NguyenSyTien2008110080;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HangHoa {

    private int maHangHoa;
    private String tenHangHoa;
    private String ngayNhapKho;
    private String loaiHangHoa;
    private int giaNhap;
    private int soLuongTonKho;
    private Date date;
    protected double DonGia;

    HangHoa() {
    };

    HangHoa(int maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    HangHoa(String ngay) {
        this.ngayNhapKho = ngay;
    }

    HangHoa(String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho) {
        this.loaiHangHoa = loaiHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.giaNhap = giaNhap;
        this.ngayNhapKho = ngayNhapKho;
    }

    HangHoa(int maHangHoa, String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho, int soLuongTonKho) {
        this.maHangHoa = maHangHoa;
        this.loaiHangHoa = loaiHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.giaNhap = giaNhap;
        this.ngayNhapKho = ngayNhapKho;
        this.soLuongTonKho = soLuongTonKho;
    }

    public void setMaHangHoa(int maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public void setLoaiHangHoa(String loaiHangHoa) {
        this.loaiHangHoa = loaiHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public void setNgayNhapKho(String ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public String getNgayNhapKho() {
        return ngayNhapKho;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public String getLoaiHangHoa() {
        return loaiHangHoa;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public int getMaHangHoa() {
        return maHangHoa;
    }

    // chuyển từ kiểu string sang date
    public Date stringToDate() {
        String time = getNgayNhapKho();
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy");
            Date date = (Date) formatter.parse(time);
            return date;
        } catch (Exception e) {
        }
        return date;

    }

    @Override
    public String toString() {
        return ("\nMa hang hoa: " + getMaHangHoa() + "\nLoai hang hoa: " + getLoaiHangHoa()
                + "\nTen hang hoa: "
                + getTenHangHoa() + "\nGia hang hoa: " + getGiaNhap() + " VND"
                + "\nSo luong ton kho: " + getSoLuongTonKho() + "\nNgay nhap kho: "
                + stringToDate()) + "\n";
    }

    // so sánh 2 mã hàng hóa - ghi di lai equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HangHoa) {
            HangHoa h2 = ((HangHoa) obj);
            if (h2.getMaHangHoa() == this.maHangHoa) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void DanhGia() {

    }

    public double tinhVAT(double vAT) {
        return 0;
    }

    public DanhSachQuanLy DanhGia(DanhSachQuanLy qlhh, Scanner input) {
        return null;
    }
}
