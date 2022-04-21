package NguyenSyTien2008110080;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class LayNgayGioHienTai {
    LayNgayGioHienTai() {
    };

    // Lay thoi gian thuc
    public String layThoiGianHienTai() {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Date today = new Date(0);
        String ngay = formatter.format(today);

        return ngay;

    }

}
