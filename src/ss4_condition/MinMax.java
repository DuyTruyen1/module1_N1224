package ss4_condition;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat (a) : ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai (b) : ");
        int b = sc.nextInt();

//        Cach 1
//        int max, min;
//
//        if (a > b) {
//            max = a;
//            min = b;
//        } else {
//            max = b;
//            min = a;
//        }

//        Cach 2

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        System.out.println("So lon nhat la : " + max);
        System.out.println("So nho nhat la : " + min);
    }
}
