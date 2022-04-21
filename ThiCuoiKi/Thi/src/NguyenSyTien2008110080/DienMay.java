package NguyenSyTien2008110080;

public class DienMay extends HangHoa {
    static int count = 0; // de thong ke so luong tung loai hang hoa

    DienMay() {
    }

    DienMay(int maHangHoa, String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho,
            int soLuongTonKho) {
        super(maHangHoa, loaiHangHoa, tenHangHoa, giaNhap, ngayNhapKho, soLuongTonKho);
        count++;
    }

    public void DanhGia() {
        if (getSoLuongTonKho() < 3) {
            System.out.println("Ban Duoc");
        } else {
            System.out.println("Khong Danh Gia");

        }

    }

    public double tinhVAT(double VAT) {
        VAT = this.DonGia * (10 / 100);
        return VAT;
    }
}
