package NguyenSyTien2008110080;

public class SanhSu extends HangHoa {
    static int count = 0; // de thong ke so luong tung loai hang hoa

    SanhSu(int maHangHoa, String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho,
            int soLuongTonKho) {
        super(maHangHoa, loaiHangHoa, tenHangHoa, giaNhap, ngayNhapKho, soLuongTonKho);
        count++;
    }

    public void DanhGia() {
        // TODO Auto-generated method stub
        if (getSoLuongTonKho() > 50 && tinhThoiGianLuuKho() > 10) {
            System.out.println("Ban cham: " + toString());
        }
    }

    private int tinhThoiGianLuuKho() {
        return 0;
    }

    public double tinhVAT(double VAT) {
        // TODO Auto-generated method stub
        return super.tinhVAT(VAT);
    }
}
