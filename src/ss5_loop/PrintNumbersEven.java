package ss5_loop;

import java.util.Scanner;

public class PrintNumbersEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = sc.nextInt();

        int count = 0, distance = 1;

        for (int i = 2; i <= n; i += 2) {
            if (count == distance) {
                System.out.println(-i + "");
                count = 0;
                distance++;
            } else {
                System.out.println(i + "");
                count++;
            }
        }
    }
}
