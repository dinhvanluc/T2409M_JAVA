package ASM7;

import java.util.*;
import java.text.*;

public class QuanLyHoaDon {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<KhachHang> ds = new ArrayList<>();
        System.out.print("Nhập số hóa đơn: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Khách hàng (1-VN, 2-NN): ");
            int loai = Integer.parseInt(sc.nextLine());
            System.out.print("Mã KH: ");
            String maKH = sc.nextLine();
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Ngày ra HĐ (dd/MM/yyyy): ");
            Date ngayRaHD = sdf.parse(sc.nextLine());
            System.out.print("Số lượng: ");
            int soLuong = Integer.parseInt(sc.nextLine());

            if (loai == 1) {
                System.out.print("Đối tượng (sinh hoạt, kinh doanh, sản xuất): ");
                String doiTuong = sc.nextLine();
                Object doituong = null;
                ds.add(new KhachHangVietNam(maKH, hoTen, ngayRaHD, soLuong, doituong) {
                    @Override
                    public void hienthi() {

                    }
                });
            } else {
                System.out.print("Quốc tịch: ");
                String quocTich = sc.nextLine();
                ds.add(new KhachHangNuocNgoai(maKH, hoTen, ngayRaHD, soLuong, quocTich) {
                    @Override
                    public void hienthi() {

                    }
                });
            }
        }

        System.out.println("\n--- DANH SÁCH HÓA ĐƠN ---");
        for (KhachHang kh : ds) {
            kh.hienThi();
        }

        // Tổng số lượng
        int tongVN = 0, tongNN = 0;
        double tongTTNN = 0;
        int demNN = 0;

        for (KhachHang kh : ds) {
            if (kh instanceof KhachHangVietNam) {
                tongVN += kh.getSoLuong();
            } else {
                tongNN += kh.getSoLuong();
                tongTTNN += kh.thanhTien();
                demNN++;
            }
        }

        System.out.println("\nTổng SL khách hàng VN: " + tongVN);
        System.out.println("Tổng SL khách hàng NN: " + tongNN);

        if (demNN > 0) {
            System.out.println("TB thành tiền KH NN: " + (tongTTNN / demNN));
        } else {
            System.out.println("Không có KH NN để tính trung bình");
        }

        // Hóa đơn tháng 01/2019
        System.out.println("\n--- HÓA ĐƠN THÁNG 01/2019 ---");
        for (KhachHang kh : ds) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(kh.getngayRaHD());
            int thang = cal.get(Calendar.MONTH) + 1;
            int nam = cal.get(Calendar.YEAR);
            if (thang == 1 && nam == 2019) {
                kh.hienThi();
            }
        }
    }
}
