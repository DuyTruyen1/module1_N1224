package ss5_loop;

import java.util.Scanner;

public class DivisorsAndMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen duong b: ");
        int b = sc.nextInt();

        int uscln = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                uscln = i;
                break;
            }
        }

        int bscnn;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                bscnn = i;
                break;
            }
        }
        System.out.println("Uoc so chung lon nhat cua " + a + " va " + b + " la " + uscln);
        System.out.println("Boi so chung nho nhat cua " + a + " va " + b + " la " + bscnn);
    }
}
