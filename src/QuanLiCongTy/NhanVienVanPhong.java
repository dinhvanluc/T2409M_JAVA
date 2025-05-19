package QuanLiCongTy;


public class NhanVienVanPhong extends NhanVien {
    int soNgayLamViec;
    double heSoPhuCap;

    public double tinhLuong() {
        return luongCoBan + soNgayLamViec * 200 + heSoPhuCap * 500;
    }

    void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("số ngày làm việc" + soNgayLamViec);
        System.out.println("heSoPhuCap :"+ heSoPhuCap);
        System.out.println("tổng lương"+ tinhLuong());

    }
}
