package ss4_condition;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số  b: ");
        int b = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem ");
            } else {
                System.out.println("phuong trinh vo nghiem ");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x: " +x);
        }
    }
}
