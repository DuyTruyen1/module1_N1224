package ss4_condition;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tham nien cong tac : ");
        int tnct = sc.nextInt();

        double luongCoBan = 650000.0;

        double heSoLuong;

        if (tnct < 12) {
            heSoLuong = 1.92;
        } else if (tnct < 36) {
            heSoLuong = 2.34;
        } else if (tnct < 60) {
            heSoLuong = 3.0;
        } else {
            heSoLuong = 4.5;
        }

        double luong = luongCoBan + heSoLuong;
        System.out.println("Luong cua nhan vien la : $" + luong);
    }
}
