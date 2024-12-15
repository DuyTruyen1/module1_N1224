package ss4_condition;

import java.util.Scanner;

public class QuadraticEquation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a : ");
        double a = sc.nextDouble();
        System.out.print("Nhap he so b : ");
        double b = sc.nextDouble();
        System.out.print("Nhap he so c : ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem. ");
                } else {
                    System.out.println("Phuong trinh vo nghiem. ");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiem cua phuong trinh x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiem kep cua phuong trinh la x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiem cua phuong trinh la x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}
