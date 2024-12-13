package ss3_java_overview;

import java.util.Scanner;

public class NumberOfButtons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào biển số xe của bạn: ");
        int n = sc.nextInt();

        int sum = n % 10;
        n = n/10;

        sum = sum + n % 10;
        n = n/10;

        sum = sum + n % 10;
        n = n/10;

        sum = sum + n;
        int buttonNumber = sum % 10;

        System.out.println("Số Nút: "+buttonNumber);
    }
}
