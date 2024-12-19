package ss6_method;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương: ");
        int n = sc.nextInt();

        System.out.printf("Số đảo của %d: %d\n", n, reversedNumber(n));

        if (symmetricalNumber(n)) {
            System.out.printf("%d la so doi xung.\n", n);
        } else {
            System.out.printf("%d khong la so doi xung.\n", n);
        }

        if (squareNumber(n)) {
            System.out.printf("%d la so chinh phuong.\n", n);
        } else {
            System.out.printf("%d khong la so chinh phuong.\n", n);
        }

        if (primeNumber(n)) {
            System.out.printf("%d la so nguyen to.\n", n);
        } else {
            System.out.printf("%d khong la so nguyen to.\n", n);
        }


    }

    public static int reversedNumber(int n) {
        int sodao = 0;
        while (n != 0) {
            int digit = n % 10;
            sodao = sodao * 10 + digit;
            n /= 10;
        }
        return sodao;
    }

    public static boolean symmetricalNumber(int n) {
        return reversedNumber(n) == n;
    }

    public static boolean squareNumber(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static boolean squareNumber2(int n) {
        int x = (int) Math.sqrt(n);
        return x * x == n;
    }

    public static boolean primeNumber(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int totalSquareNumber(int n){
        int total = 0;
        while (n != 0) {
            int unit = n % 10;
            if(squareNumber(unit)){
                total += unit;
            }
            n /= 10;
        }
        System.out.println();
        return total;
    }

//    public static int calculateTotalOddDigits(int n) {
//        return
//    }
}
