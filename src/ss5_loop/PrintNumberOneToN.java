package ss5_loop;

import java.util.Scanner;

public class PrintNumberOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "\t");
        }
    }
}
