package ss4_condition;

import java.util.Scanner;

public class NumberEngLish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so tu 1 den 10: ");
        int n = sc.nextInt();

        String englishNumber;
        if (n == 1) {
            englishNumber = "One";
        } else if (n == 2) {
            englishNumber = "Two";
        } else if (n == 3) {
            englishNumber = "Three";
        } else if (n == 4) {
            englishNumber = "Four";
        } else if (n == 5) {
            englishNumber = "Five";
        } else if (n == 6) {
            englishNumber = "Six";
        } else if (n == 7) {
            englishNumber = "Seven";
        } else if (n == 8) {
            englishNumber = "Eight";
        } else if (n == 9) {
            englishNumber = "Nine";
        } else if (n == 10) {
            englishNumber = "Ten";
        } else {
            englishNumber = "Number Not Found";
        }


        System.out.println("Number " + n + " writing English :" + englishNumber);
    }
}
