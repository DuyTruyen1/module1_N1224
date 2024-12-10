package exercise;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào Bán kính X : ");
        double x = sc.nextDouble();

        double y = 2 * Math.PI * x;

        double a = Math.PI * Math.pow(x, 2);

        System.out.println("Chu vi Y = "+y);
        System.out.println("Diện tích A = "+a);

    }
}
