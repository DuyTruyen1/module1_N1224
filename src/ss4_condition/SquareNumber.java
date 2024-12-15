package ss4_condition;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen duong x: ");
        int x = sc.nextInt();

        double square = Math.sqrt(x);

        if (square % 1 == 0) {
            System.out.println(x + "la so chinh phuong. ");
        } else {
            System.out.println(x + "khong phai la so chinh phuong");
        }
    }
}
