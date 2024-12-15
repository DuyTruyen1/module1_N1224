package ss4_condition;

import java.util.Scanner;

public class DaysOfTheMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao thang (1 - 12) :");
        int month = sc.nextInt();
        System.out.print("Nhap vao nam : ");
        int year = sc.nextInt();

        int daysInMonth;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }

        System.out.printf("So ngay trong thang %d nam %d la %d ngay.", month, year, daysInMonth);
    }
}
