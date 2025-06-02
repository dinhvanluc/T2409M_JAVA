package ASM7;
import java.text.*;
import java.util.*;

public abstract class KhachHangVietNam extends KhachHang {
    private String doiTuongKH;
    private final int dinhMuc = 50;
    public KhachHangVietNam(String maKH, String HoTen, Date ngayraHD, int soLuong, Object doituong) {
        super(maKH, HoTen, ngayraHD, soLuong);
        this.doiTuongKH = maKH;
    }
    private int donGia(int soLuong) {
        if (soLuong >= 50) return 1000;
         else if (soLuong >= 100) return 1200;
         else if (soLuong >= 200) return 1500;
         else return 2000;
    }
    public double thanhtien(){
        if (soLuong >= dinhMuc){
            return soLuong* donGia(soLuong);
        }else {
            int vuotDinhMuc = soLuong- dinhMuc;
            return dinhMuc * donGia(dinhMuc) + vuotDinhMuc * donGia(vuotDinhMuc);
        }
    }
    public void hienThi() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("VN : %s, %s, %s, %s, SL : %d, TT : %.2f\n ", maKH, HoTen, sdf.format(ngayraHD), doiTuongKH, soLuong, thanhtien());
    }
}
