package NguyenSyTien2008110080;

public class ThucPham extends HangHoa {
    static int count = 0; // Thống kê số lượng từng loại

    ThucPham(int maHangHoa, String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho,
            int soLuongTonKho) {
        super(maHangHoa, loaiHangHoa, tenHangHoa, giaNhap, ngayNhapKho, soLuongTonKho);
        count++;
    }

    public void DanhGia() {
        // TODO Auto-generated method stub
        if (getSoLuongTonKho() > 0 && kiemTraHetHan() == true) {
            System.out.println("Kho ban :" + toString());
        }
    }

    private boolean kiemTraHetHan() {
        return false;
    }

    public double tinhVAT(double VAT) {
        VAT = this.DonGia * (10 / 100);
        return VAT;
    }
}
