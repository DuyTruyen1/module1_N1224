package ss5_loop;

import java.util.Scanner;

public class CalculateTotalS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n: ");

        int n = sc.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            int fact = 1;

            for (int j = 1; j <= (2 * i - 1); j++) {
                fact *= j;
            }
            sum += 1.0 / fact;
        }
        System.out.println("Tong S = " + sum);
    }
}
