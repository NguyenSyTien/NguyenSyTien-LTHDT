package NguyenSyTien2008110080;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class HangSanhSu extends HangHoa {
    private String nhaSX;
    private Date ngayNhapKho;

    // interfaces
    //constructor
    public HangSanhSu() {

    }

    public HangSanhSu(String MaHangHoa, String TenHangHoa, int soLuongTon, double DonGia, String nhaSX,
            Date ngayNhapKho) throws ParseException {
        super(MaHangHoa, TenHangHoa, soLuongTon, DonGia);
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getNhaSX() {
        return nhaSX;
    }
    //nhap hang sanh su
    @Override
    public void nhap() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // TODO Auto-generated method stub
        super.nhap();
        System.out.print("Nhap nha san xuat: ");
        this.nhaSX = scanner.nextLine();
        System.out.print("Ngay nhap kho: ");

        try {
            this.ngayNhapKho = simpleDateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    //tinh VAT
    @Override
    public double tinhVAT(double VAT) {
        // TODO Auto-generated method stub
        return super.tinhVAT(VAT);
    }
    //toString
    @Override   
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // TODO Auto-generated method stub
        return super.toString() + "Nha san xuat: " + this.nhaSX + "|" + "Ngay nhap kho: "
                + simpleDateFormat.format(this.ngayNhapKho);
    }
    //tinh thoi gian lưu kho
    public long tinhThoiGianLuuKho() {
        Date hienTai = new Date();
        long noDay = (hienTai.getTime() - ngayNhapKho.getTime()) / (24 * 3600 * 1000);
        return noDay;
    }
    //danh gia muc do buon ban
    @Override
    public void DanhGia() {
        // TODO Auto-generated method stub
        if (getSoLuongTon() > 50 && tinhThoiGianLuuKho() > 10) {
            System.out.println("Ban cham: " + toString());
        }
    }
}
