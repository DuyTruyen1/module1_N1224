package ss5_loop;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
//        So nguyen to chi chia het cho 1 va chinh no
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Khong la so nguyen to.");
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("La so nguyen to.");
        }
    }
}
