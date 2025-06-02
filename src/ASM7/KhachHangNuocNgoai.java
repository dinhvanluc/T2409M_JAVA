package ASM7;
import java.text.*;
import java.util.*;
public abstract class KhachHangNuocNgoai extends KhachHang{
    private String quoctich;
    public KhachHangNuocNgoai(String maKH, String HoTen, Date ngayraHD, int soLuong, String quocTich) {
        super(maKH, HoTen, ngayraHD, soLuong);
        this.quoctich = quoctich;
    }
    private int donGia(int soLuong) {
        if (soLuong <= 50) return 1000;
        else if (soLuong <= 100) return 1200;
        else if (soLuong <= 200) return 1500;
        else return 2000;
    }
    public double thanhtien(){
        return  soLuong*donGia(soLuong);
    }
    public  void hienThi(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("VN : %s, %s, %s, %s, SL : %d, TT : %.2f\n ", maKH, HoTen, sdf.format(ngayraHD), quoctich, soLuong, thanhtien());
    }

}
