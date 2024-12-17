package ss5_loop;

import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tien mon do: ");
        int gia = sc.nextInt();
        System.out.print("Nhap so tien cua khach hang: ");
        int tien = sc.nextInt();

        int tienThoi = tien - gia;
        int menhGiaTien;

        for (int i = 2; i >= 0; i--) {
            int heSo = (int) Math.pow(10, i);

            menhGiaTien = 500 * heSo;
            if (tienThoi >= menhGiaTien) {
                System.out.printf("%d to %d\n", tienThoi / menhGiaTien, menhGiaTien);
                tienThoi %= menhGiaTien;
            }

            menhGiaTien = 2000 * heSo;
            if (tienThoi >= menhGiaTien) {
                System.out.printf("%d to %d\n", tienThoi / menhGiaTien, menhGiaTien);
            }

            menhGiaTien = 1000 * heSo;
            if (tienThoi >= menhGiaTien) {
                System.out.printf("%d to %d\n", tienThoi / menhGiaTien, menhGiaTien);
            }
        }
        System.out.println("So tien con lai: " + tienThoi);
    }
}
