package ss5_loop;

import java.util.Scanner;

public class CalculateTotalS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        int n = sc.nextInt();

        int s = 0;
        int p = 1;

        while (n > 0) {
            int digit = n % 10;

            s += digit;
            p *= digit;

            n /= 10;

        }
        System.out.println("Tong cac chu so: " + s);
        System.out.println("Tich cac chu so: " + p);
    }
}
