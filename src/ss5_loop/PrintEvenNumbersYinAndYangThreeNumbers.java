package ss5_loop;

import java.util.Scanner;

public class PrintEvenNumbersYinAndYangThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = sc.nextInt();

//        Cach1
//        for (int i = 2; i <= n; i += 2) {
//            if (i % 6 == 0) {
//                System.out.println(-1 + "");
//            } else {
//                System.out.println(i + "");
//            }
//        }

        //Cach2
        int x = 3;
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            count++;

            if (count == x) {
                System.out.println(-i + "");
                count = 0;
            } else {
                System.out.println(i + "");
            }
        }
    }
}
