package ss7_debug_string;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi a: ");
        String a = sc.nextLine();
        System.out.println("Nhap vao chuoi b: ");
        String b = sc.nextLine();

        int compare = a.compareTo(b);

        if (compare == 0) {
            System.out.println("a == 0");
        } else if (compare < 0) {
            System.out.println("a < 0");
        } else {
            System.out.println("a > 0");
        }
    }
}

