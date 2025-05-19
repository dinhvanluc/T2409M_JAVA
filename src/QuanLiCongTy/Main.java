package QuanLiCongTy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // thêm nhân viên văn phòng
        System.out.println("nhập thông tin nhana viên văn phòng :" );
        System.out.println("họ và tên :" );
        String hoTen1 = sc.nextLine();
        System.out.println("ngày sinh :" );
        String ngaySinh1 = sc.nextLine();
        System.out.println("lương cơ bản : ");
        double luongCB1 = sc.nextDouble();
        System.out.println("số ngày làm việc : " );
        int soNgay = sc.nextInt();
        System.out.println("hệ số phụ cấp : ");
        double heSo = sc.nextDouble();
        // nhân viên sản xuất
        System.out.println("nhập thông tin nhân viên sản xuất : ");
        System.out.println("họ tên : ");
        String hoTen2 = sc.nextLine();
        System.out.println("ngày sinh : ");
        String ngaySinh2 = sc.nextLine();
        System.out.println("lương cơ bản : ");
        double luongCB2 = sc.nextDouble();
        System.out.println("số sản phẩm : ");
        int soSP = sc.nextInt();
        // hiện thị thôn tin
        System.out.println("DANH SÁCH NHÂN VIÊN");

    }
}
