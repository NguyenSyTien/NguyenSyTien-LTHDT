package Buoi8_hangTHucPham;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
        HangThucPham1 htp = new HangThucPham1("TP01");
        System.out.println(htp.getMaHang());

        

        Date date = new Date(0);
        System.out.println(date.toString());

        //09/3/2022 - dd/mm/yyyy

        String ngay1 = "01/03/2022";
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        Date ngaySX = (Date) format.parse(ngay1);

        String ngayHetHan = "08/03/2022";

         HangThucPham1 htp2 = new HangThucPham1("TP2");

         System.out.println(htp2);

         if(htp2.kiemTraHetHan()){
             System.out.println("Het Han !!!! Dung An no!!!");
         }


    }
}
