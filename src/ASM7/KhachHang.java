package ASM7;

import java.util.Date;

public  abstract class KhachHang {
    public String maKH;
    public String HoTen;
    public Date ngayraHD;
    public int soLuong;

    public KhachHang (String maKH , String HoTen, Date ngayraHD , int soLuong)  {
        this.maKH = maKH;
        this.HoTen = HoTen;
        this.ngayraHD = ngayraHD;
        this.soLuong = soLuong;
    }
    public Date getNgayraHD() {
        return ngayraHD;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public abstract double thanhtien();
    public abstract void hienthi();

    public Date getngayRaHD() {

        return ngayraHD;
    }

    public void hienThi() {

    }

    public double thanhTien() {
        return thanhtien();
    }
}

