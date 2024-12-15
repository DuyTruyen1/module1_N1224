package ss5_loop;

import java.util.Scanner;

public class PrintNumberEvenTwoToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so: ");
        int n = sc.nextInt();
        for (int i = 2; i <= 2 * n; i += 2) {
            System.out.println(i + "");
        }

    }
}
