package exercise;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên A: ");
           int a = sc.nextInt();
           System.out.print("Nhập vào số nguyên B: ");
           int b = sc.nextInt();

           int sum = a + b;
           int difference = a - b;
           int Multiplication = a * b;
           double Division = ((double) a / b);

        System.out.println("Phép cộng :"+ sum);
        System.out.println("Phép trừ :"+ difference);
        System.out.println("Phép nhân :"+ Multiplication);
        System.out.println("Phép Chia :"+ Division);
    }
}
