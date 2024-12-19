package ss6_method;

import java.util.Scanner;

public class Student {
    static String ten;
    static int tuoi;
    static String gioiTinh;
    static double luong;
    static double diemTB;

    static void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        ten = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine(); // xún dòng

        System.out.print("Nhập giới tính (Nam/Nữ): ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhập lương: ");
        luong = sc.nextDouble();

        System.out.print("Nhập điểm trung bình: ");
        diemTB = sc.nextDouble();
    }

    static void inThongTin() {
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Lương: " + luong);
        System.out.println("Điểm trung bình: " + diemTB);
    }

    static void main(String[] args) {

        nhapThongTin(); // Gọi phương thức nhập thông tin
        inThongTin();   // Gọi phương thức in thông tin
    }
}
