package ss5_loop;

import java.util.Scanner;

public class ConvertIntegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong: ");
        int n = sc.nextInt();

        String binary = "";

        while (n > 0) {
            binary = n % 2 + binary;
            n /= 2;
        }
        System.out.println("So nhi phan la: "+binary);
    }
}
