package NguyenSyTien2008110080;

import java.text.ParseException;
import java.util.Scanner;

public class HangHoa {
    protected String MaHangHoa;
    protected String TenHangHoa;
    private int SoLuongTon;
    private double DonGia;
   

    public void setMaHangHoa(String maHangHoa) {
        MaHangHoa = maHangHoa;
    }

    public String getMaHangHoa(String MahangHoa) {

        return MaHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        TenHangHoa = tenHangHoa;
    }

    public String getTenHangHoa() {
        return TenHangHoa;
    }

    public void setSoLuongTon(int soLuongTon) {
        SoLuongTon = soLuongTon;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public double getDonGia() {
        return DonGia;
    }

    public HangHoa() {

    }

    public HangHoa(String MaHangHoa, String TenHangHoa, int SoLuongTon, double DonGia)
            throws ParseException {
        this.MaHangHoa = MaHangHoa;
        this.TenHangHoa = TenHangHoa;
        this.SoLuongTon = SoLuongTon;
        this.DonGia = DonGia;

    }

    public boolean DieuKien() {
        if (MaHangHoa == null || MaHangHoa.isEmpty()) {
            System.out.println("Ma Hang Khong duoc de trong");
            return false;
        } else if (TenHangHoa == null || TenHangHoa.isEmpty()) {
            System.out.println("Ten Hang Khong duoc de trong");
            return false;
        } else if (SoLuongTon < 0) {
            System.out.println("So luong hang ton phai lon hon hoac bang 0");
            return false;
        } else if (DonGia <= 0) {
            System.out.println("Don gia phai lon hon 0");
            return false;
        }

        return true;

    }

    public String toString() {
        return "Thong Tin Ve Hang Hoa:\n" + "Ma Hang Hoa:'" + MaHangHoa + "\nTen Hang Hoa:" + TenHangHoa
                + "\nso luong Ton:" + SoLuongTon + "\nDonh Gia hang hoa :" + DonGia;

    }

    public double tinhVAT(double VAT) {
        VAT = this.DonGia * (10 / 100);
        return VAT;
    }

    public void DanhGia() {
    }

    

    public void nhap() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap ma hang: ");
            this.setMaHangHoa(scanner.nextLine());
            System.out.print("Nhap ten hang: ");
            this.TenHangHoa = scanner.nextLine();
            System.out.print("Nhap so luong ton kho: ");
            this.SoLuongTon = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhap don gia: ");
            this.DonGia = scanner.nextDouble();
            scanner.nextLine();
        }
}
}
