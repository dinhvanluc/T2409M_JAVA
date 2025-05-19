package QuanLiCongTy;

public class NhanVien {
    String tenNhanVien;
    int ngaySinh ;
    double luongCoBan;

    public double tinhLuong() {
        return luongCoBan;
    }


    void hienThiThongTin(){
        System.out.println("họ và tên :"+ tenNhanVien);
        System.out.println("ngaySinh :"+ ngaySinh);
        System.out.println("luongCoBan :"+ luongCoBan);
    }

    void hienThiThongTin(boolean hienThiLuong){
        hienThiThongTin();
        if(hienThiLuong){
            System.out.println("tổng lương" + hienThiLuong);
        }
    }

}
