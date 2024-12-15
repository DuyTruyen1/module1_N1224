package ss4_condition;

import java.util.Scanner;

public class NumberEnglish2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so tu 1 den 10: ");
        int n = sc.nextInt();

        String englishNumber;

        switch (n) {
            case 1:
                englishNumber = "ONE";
                break;
            case 2:
                englishNumber = "Two";
                break;
            case 3:
                englishNumber = "Three";
                break;
            case 4:
                englishNumber = "Four";
                break;
            case 5:
                englishNumber = "Five";
                break;
            case 6:
                englishNumber = "Six";
                break;
            case 7:
                englishNumber = "Seven";
                break;
            case 8:
                englishNumber = "Eight";
                break;
            case 9:
                englishNumber = "Nine";
                break;
            case 10:
                englishNumber = "Ten";
                break;
            default:
                englishNumber = "So khong hop le";
        }
        System.out.println("So " + n + " viet bang tieng anh :" + englishNumber);
    }
}
