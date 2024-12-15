package ss5_loop;

import java.util.Scanner;

public class CalculateTotalS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Tong S = " + sum);
    }
}
