package Test;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Câu 1");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào cạnh: ");
        int canh = sc.nextInt();

        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
