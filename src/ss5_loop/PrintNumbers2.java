package ss5_loop;

import java.util.Scanner;

public class PrintNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        int n = sc.nextInt();

        int a = 1;

        int d = 1;

        while (a <= n){
            System.out.println(a * d + " ");

            a = a * 2 + 1;

            d = -d ;
        }
    }
}
