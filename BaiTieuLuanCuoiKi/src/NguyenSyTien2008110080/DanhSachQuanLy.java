package NguyenSyTien2008110080;


import java.util.ArrayList;


public class DanhSachQuanLy {

    /**
     *
     */
    

    private final ArrayList<HangHoa> dsHangHoa = new ArrayList<>();
    
    public void them(HangHoa hangHoa) {
        dsHangHoa.add(hangHoa);
    }
     //them hang hoa tu ban phim
     public void themTuBP(int loaiHangHoa) {
        if (loaiHangHoa == 1) {
            HangThucPham hangThucPham = new HangThucPham();
            hangThucPham.nhap();
            this.dsHangHoa.add(hangThucPham);
        } else if (loaiHangHoa == 2) {
            HangSanhSu hangSanhSu = new HangSanhSu();
            hangSanhSu.nhap();
            this.dsHangHoa.add(hangSanhSu);
        } else if (loaiHangHoa == 3) {
            HangDienMay hangDienMay = new HangDienMay();
            hangDienMay.nhap();
            this.dsHangHoa.add(hangDienMay);
        }
    }
    //in danh sach hang hoa
    public void inDSHangHoa() {
        for (HangHoa hangHoa : dsHangHoa) {
            System.out.println(hangHoa);
        }
    }
    //tim hang hoa theo ma
    public HangHoa timHangHoaTheoMa(String maHH) {
        HangHoa hangHoa = null;
        for (HangHoa hh : dsHangHoa) {
            if (hh.getMaHangHoa(maHH).equals(maHH)) {
                hangHoa = hh;
            }
        }
        System.out.println(hangHoa);
        return hangHoa;
    }
    // danh gia muc do buon ban
    public HangHoa danhGiaMucDoBuonBan() {
        HangHoa hangHoa = null;
        for (HangHoa hh : dsHangHoa) {
            hh.DanhGia();
        }
        return hangHoa;
    }
    //Xoa hang hoa
    public void xoaHangHoa(HangHoa hangHoa) {
        dsHangHoa.remove(hangHoa);

    }
    //Tim hang hoa theo vi tri
    public int timHangHoaTheoViTri(HangHoa hangHoa) {
        int viTri = -1;
        viTri = dsHangHoa.indexOf(hangHoa);
        return viTri;
    }
    //Sua hang hoa
    public HangHoa suaHangHoa(int viTri, HangHoa hangHoa) {
        timHangHoaTheoViTri(hangHoa);
        dsHangHoa.set(viTri, hangHoa);
        hangHoa.nhap();
        return hangHoa;
    }

}


   