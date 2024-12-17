package ss5_loop;

import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 3 số nguyên dương
        System.out.println("Nhập số nguyên dương thứ nhất: ");
        int so1 = scanner.nextInt();

        System.out.println("Nhập số nguyên dương thứ hai: ");
        int so2 = scanner.nextInt();

        System.out.println("Nhập số nguyên dương thứ ba: ");
        int so3 = scanner.nextInt();

        int tongGiaiThua = tinhGiaiThua(so1) + tinhGiaiThua(so2) + tinhGiaiThua(so3);

        System.out.println("Tổng giai thừa của 3 số là: " + tongGiaiThua);
    }

    public static int tinhGiaiThua(int n) {
        int giaiThua = 1;
        int i = 1;
        while (i <= n) {
            giaiThua *= i;
            i++;
        }
        return giaiThua;
    }
}
