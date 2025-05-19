package QuanLiCongTy;

public class nhanVienSanXuat extends NhanVien{
    int soSanPham;

   public double tinhLuong(){
        return luongCoBan + soSanPham * 200;
    }


    void hienThiThongTin() {
       super.hienThiThongTin();
        System.out.println("số sản phẩm :"+ soSanPham);
        System.out.println("tổng lương"+ tinhLuong());
    }
}


