package ss4_condition;

import java.util.Scanner;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 ky tu chu cai: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
            } else {
                ch += 32;
            }

            System.out.println("Ky tu sau khi da doi: " + ch);
        } else {
            System.out.println("Ban da nhap sai. Hay nhap 1 ky tu chu cai.");
        }
    }
}
