
package ss6_method;

import java.util.Scanner;

public class EmployeeManager {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số lượng nhân viên n <= 5: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n > 5 || n < 1) {
            System.out.println("Số lượng nhân viên phải trong khoảng từ 1 đến 5.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            switch (i) {
                case 1 -> nhapNhanVien1();
                case 2 -> nhapNhanVien2();
                case 3 -> nhapNhanVien3();
                case 4 -> nhapNhanVien4();
                case 5 -> nhapNhanVien5();
            }
        }

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. In nhân viên 1");
            System.out.println("2. In nhân viên 2");
            System.out.println("3. In nhân viên 3");
            System.out.println("4. In nhân viên 4");
            System.out.println("5. In nhân viên 5");
            System.out.println("6. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> inNhanVien1();
                case 2 -> inNhanVien2();
                case 3 -> inNhanVien3();
                case 4 -> inNhanVien4();
                case 5 -> inNhanVien5();
                case 6 -> {
                    System.out.println("Kết thúc chương trình.");
                    isRunning = false;
                }
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    static String tenNV1, tenNV2, tenNV3, tenNV4, tenNV5;
    static int tuoiNV1, tuoiNV2, tuoiNV3, tuoiNV4, tuoiNV5;
    static String gioiTinhNV1, gioiTinhNV2, gioiTinhNV3, gioiTinhNV4, gioiTinhNV5;
    static double luongNV1, luongNV2, luongNV3, luongNV4, luongNV5;

    // Phương thức nhập nhân viên 1
    static void nhapNhanVien1() {
        System.out.println("\nNhập thông tin nhân viên 1:");
        System.out.print("Tên: ");
        tenNV1 = sc.nextLine();
        System.out.print("Tuổi: ");
        tuoiNV1 = sc.nextInt();
        sc.nextLine(); // Xử lý ký tự xuống dòng
        System.out.print("Giới tính: ");
        gioiTinhNV1 = sc.nextLine();
        System.out.print("Lương: ");
        luongNV1 = sc.nextDouble();
        sc.nextLine();
    }

    static void nhapNhanVien2() {
        System.out.println("\nNhập thông tin nhân viên 2:");
        System.out.print("Tên: ");
        tenNV2 = sc.nextLine();
        System.out.print("Tuổi: ");
        tuoiNV2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Giới tính: ");
        gioiTinhNV2 = sc.nextLine();
        System.out.print("Lương: ");
        luongNV2 = sc.nextDouble();
        sc.nextLine();
    }

    static void nhapNhanVien3() {
        System.out.println("\nNhập thông tin nhân viên 3:");
        System.out.print("Tên: ");
        tenNV3 = sc.nextLine();
        System.out.print("Tuổi: ");
        tuoiNV3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Giới tính: ");
        gioiTinhNV3 = sc.nextLine();
        System.out.print("Lương: ");
        luongNV3 = sc.nextDouble();
        sc.nextLine();
    }

    static void nhapNhanVien4() {
        System.out.println("\nNhập thông tin nhân viên 4:");
        System.out.print("Tên: ");
        tenNV4 = sc.nextLine();
        System.out.print("Tuổi: ");
        tuoiNV4 = sc.nextInt();
        sc.nextLine();
        System.out.print("Giới tính: ");
        gioiTinhNV4 = sc.nextLine();
        System.out.print("Lương: ");
        luongNV4 = sc.nextDouble();
        sc.nextLine();
    }

    static void nhapNhanVien5() {
        System.out.println("\nNhập thông tin nhân viên 5:");
        System.out.print("Tên: ");
        tenNV5 = sc.nextLine();
        System.out.print("Tuổi: ");
        tuoiNV5 = sc.nextInt();
        sc.nextLine();
        System.out.print("Giới tính: ");
        gioiTinhNV5 = sc.nextLine();
        System.out.print("Lương: ");
        luongNV5 = sc.nextDouble();
        sc.nextLine();
    }

    static void inNhanVien1() {
        System.out.println("\nThông tin nhân viên 1:");
        System.out.printf("Tên: %s, Tuổi: %d, Giới tính: %s, Lương: %.2f\n", tenNV1, tuoiNV1, gioiTinhNV1, luongNV1);
    }

    static void inNhanVien2() {
        System.out.println("\nThông tin nhân viên 2:");
        System.out.printf("Tên: %s, Tuổi: %d, Giới tính: %s, Lương: %.2f\n", tenNV2, tuoiNV2, gioiTinhNV2, luongNV2);
    }

    static void inNhanVien3() {
        System.out.println("\nThông tin nhân viên 3:");
        System.out.printf("Tên: %s, Tuổi: %d, Giới tính: %s, Lương: %.2f\n", tenNV3, tuoiNV3, gioiTinhNV3, luongNV3);
    }

    static void inNhanVien4() {
        System.out.println("\nThông tin nhân viên 4:");
        System.out.printf("Tên: %s, Tuổi: %d, Giới tính: %s, Lương: %.2f\n", tenNV4, tuoiNV4, gioiTinhNV4, luongNV4);
    }

    static void inNhanVien5() {
        System.out.println("\nThông tin nhân viên 5:");
        System.out.printf("Tên: %s, Tuổi: %d, Giới tính: %s, Lương: %.2f\n", tenNV5, tuoiNV5, gioiTinhNV5, luongNV5);
    }
}
