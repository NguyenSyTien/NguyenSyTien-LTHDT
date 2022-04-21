package NguyenSyTien2008110080;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LayNgayGioHienTai {
    public static LocalDate stringToDate(CharSequence ngaySanSuat) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(ngaySanSuat, formatter);
        } catch (Exception e) {
            return null;
        }

    }

    public static String dateToString(LocalDate date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String s = formatter.format(date);
            return s;
        } catch (Exception e) {
            return null;
        }

    }

}
