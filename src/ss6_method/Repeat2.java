package ss6_method;

import java.util.Scanner;

public class Repeat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen duong : ");
        int n = sc.nextInt();
    }


    //    a. S = 1 + 2 + .. + n
    static int calculateSumInteger(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //     b.S = 1 * 2 + 2 * 2 + ... + n * 2
    static int calculateSumSquare(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i + i;
        }
        return sum;
    }

//      c. S = 1 + 1/2 + ... +1/n

    static double calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    //    d.S = 1 * 2 * ... * n;
    static double calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //    e.S = 1! * 2! * ... *n!
    static double calculateFactorial2(int n) {
        int sum = 0;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }
}
