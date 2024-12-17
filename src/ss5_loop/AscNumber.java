package ss5_loop;

import java.util.Scanner;

public class AscNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong : ");
        int n = sc.nextInt();

        String st = String.valueOf(n);

        boolean isIncrease = true;
        for (int i = 0; i < st.length() - 1; i++) {
            if (st.charAt(i) >= st.charAt(i + 1)) {
                System.out.println("So khong tang dan.");
                isIncrease = false;
                break;
            }
        }

        if (isIncrease) {
            System.out.println("So tang dan.");
        }
    }
}
