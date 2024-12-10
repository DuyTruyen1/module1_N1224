package exercise;

import java.time.Year;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tuổi của bạn: ");
        int age = sc.nextInt();

        int year = Year.now().getValue();
        //how to....in java

        int s = year - age;

        System.out.println("Tuổi của bạn là : " + s);

    }
}
