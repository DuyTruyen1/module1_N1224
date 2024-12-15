package ss5_loop;

import java.util.Scanner;

public class PrintEvenNumbersYinAndYang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i += 2) {
            if (i % 4 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
