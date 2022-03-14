package Buoi8_hangTHucPham;

import java.sql.Date;
import java.sql.Time;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Set;

public class hangThucPham {
    private int maHang;
    private String tenHang;
    private Float donGia  ;
    private Date ngaySanXuat;
    private Date ngayHetHan;
    public hangThucPham(){

    }
public  hangThucPham(int maHang, String tenHang, Float donGia, Date ngaySanXuat, Date ngayHetHan ){
    this.maHang = maHang;
    this.tenHang = tenHang;
    this.donGia = donGia;
    this.ngaySanXuat = ngaySanXuat;
    this.ngayHetHan = ngayHetHan;
    
}
public int getMaHang() {
    return maHang;
}

public void setMaHang(int maHang) {
    this.maHang = maHang;
}

public String getTenHang() {
    return tenHang;
}

public void setTenHang(String tenHang ) {
    this.tenHang = tenHang;
}

public double getDonGia() {
    return donGia;
}

public void setDonGia(Float donGia) {
    this.donGia =  donGia;
}

public Date getngaySanXuat() {
    return ngaySanXuat ;
}

public void setngaySanXuat(Date ngaySanXuat) {
    this.ngaySanXuat = ngaySanXuat;
}

public Date getngayHetHan() {
    return ngayHetHan;
}

public void setngayHetHan(Date ngayHetHan) {
    this.ngayHetHan = ngayHetHan;
}
public String toString() {
    //sử dung phương thức Locale để biến đổi theo tiền tệ việt nam
    Locale localeVN = new Locale("vi", "VN");
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
    String str = numberFormat.format(donGia);
    // sử dụng phương thức SimpleDateFormat để biến đổi ngày tháng năm theo dạng "dd/MM/yyyy"
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String str1 = simpleDateFormat.format(ngaySanXuat);
    String str2 = simpleDateFormat.format(ngayHetHan);
    return "Thông tin về thực phẩm: \n" +
            "Mã hàng : " + maHang +
            "\nTên hàng : '" + tenHang +
            "\nĐơn giá : " + str +
            "\nNgày sản xuất : " + str1 +
            "\nHạn sử dụng : " + str2
            ;
}

//Khởi tạo phương thức để nhập năm tháng ngày sản xuất
public void setngaySanXuat(int year, int month, int day) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day);
    this.ngaySanXuat = (Date) calendar.getTime();
}

//Khởi tạo phương thức để nhập hạn sử dụng
public void setngayHetHan(int year, int month, int day) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day);
    this.ngayHetHan = (Date) calendar.getTime();
}

//khởi tạo phương thức kiểm tra tên hàng không được để trống
public boolean kiemTraTenHang(boolean k) {
    if (this.tenHang == "" || this.tenHang.isEmpty()) {
        System.out.println("Tên hàng không được để trống : ");
    } else {
        k = false;
    }
    return k;
}

//khởi tạo hàm kiểm tra ngày hết hạn không được nhỏ hơn ngày sản xuất
public boolean kiemTraNgay(boolean t) {
    if (this.getngaySanXuat().compareTo(this.getngayHetHan()) < 0) {
        t = false;
    } else {
        System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
    }
    return t;
}

//khởi tạo phương thức kiểm tra hạn sử dụng của sản phẩm đã hết hạn hay còn hạn
public void kiemTraHSD() {
    Date today = new Date(maHang);
    today.getTime();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String st = simpleDateFormat.format(today);
    if (this.getngayHetHan().compareTo(today) < 0) {
        System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
    } else {
        System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
    }
   

}
}