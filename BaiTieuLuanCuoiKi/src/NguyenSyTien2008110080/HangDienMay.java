package NguyenSyTien2008110080;

import java.text.DecimalFormat;
import java.text.ParseException;

public class HangDienMay extends HangHoa {
    private int ThoiGianBaoHanh;
    private int CongSuat;
    private Object congSuat;

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        ThoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return ThoiGianBaoHanh;
    }

    public void setCongSuat(int congSuat) {
        CongSuat = congSuat;
    }

    public int getCongSuat() {
        return CongSuat;
    }

    public HangDienMay() {

    }

    public HangDienMay(String MaHangHoa, String TenHangHoa, int ThoiGianBaoHanh, int CongSuat, int SoLuongTon,
            double DonGia) throws ParseException {
        super(MaHangHoa, TenHangHoa, SoLuongTon, DonGia);
        this.ThoiGianBaoHanh = ThoiGianBaoHanh;
        this.CongSuat = CongSuat;
    }

    public String toString() {
        DecimalFormat decimalFormat1 = new DecimalFormat("### W");
        String SoOat = decimalFormat1.format(getCongSuat());

        return " \nThong Tin hang Dien May:" + super.toString() +
                "\nThoi Gian bao Hanh:" + ThoiGianBaoHanh + "\nCong Xuat:" + SoOat;
    }

    public boolean DieuKien() {
        if (ThoiGianBaoHanh < 0 || CongSuat < 0) {
            System.err.println("Thoi gian bao hanh hoac cong suat khong đuoc nho hon 0");
            return false;
        }
        return super.DieuKien();
    }

    public double tinhVAT(double VAT) {

        return super.tinhVAT(VAT);
    }

    public void DanhGia() {
        if (getSoLuongTon() < 3) {
            System.out.println("Ban Duoc");
        } else {
            System.out.println("Khong Danh Gia");

        }
    }
    public void nhap() {
        
        // TODO Auto-generated method stub
        super.nhap();
        System.out.print("Nhap thoi gian bao hanh: ");
        this.ThoiGianBaoHanh = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap cong suat: ");
        this.congSuat = scanner.nextDouble();
        scanner.nextLine();
    }
}
