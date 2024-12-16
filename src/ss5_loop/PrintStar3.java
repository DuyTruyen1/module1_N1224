package ss5_loop;

import java.util.Scanner;

public class PrintStar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao cac canh: ");
        int canh = sc.nextInt();

//        Hinh a
        System.out.println("Hinh A");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Hinh B
        System.out.println("Hinh C");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Hình C
        System.out.println("Hinh C");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        Hình D
        System.out.println("Hinh D");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = canh; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

//        Hình F
        System.out.println("Hinh F");
        for (int i = 1; i <= canh; i++) {
            for (int j = canh; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
