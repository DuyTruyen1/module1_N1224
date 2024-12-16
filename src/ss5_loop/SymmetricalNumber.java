package ss5_loop;

import java.util.Scanner;

public class SymmetricalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong: ");
        int n = sc.nextInt();
        String st = String.valueOf(n);

        boolean Symmetrical = true;
        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) != st.charAt(st.length() - i - 1)) {
                System.out.println("Khong la so doi xung.");
                Symmetrical = false;
                break;
            }
        }
        if (Symmetrical) {
            System.out.println("La so doi xung.");
        }
    }
}
