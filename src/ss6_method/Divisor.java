package ss6_method;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so nguyen b: ");
        int b = sc.nextInt();

        System.out.printf("Uoc so chung cua 2 so %d va %d la : %d", a, b, uscln(a, b));
    }

    static int uscln(int a, int b) {
        a = Math.abs(a); // Trả về giá trị tuyệt đối
        b = Math.abs(b);

        int min = Math.min(a, b);
        int uscln = 1; // uscln cho nhỏ nhất là 1;

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                uscln = i;
                break; //
            }
        }

        return uscln;
    }


}
