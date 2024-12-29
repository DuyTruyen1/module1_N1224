package Test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Nhap vao so luong phan tu <= 20");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);

        int[] arr = new int[n];
        System.out.println("Nhap vao mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int ketQua = tongChanLe(arr);
        System.out.println("Ket qua tong chan - tong le: " + ketQua);
    }

    public static int tongChanLe(int[] arr) {
        int tongChan = 0, tongLe = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                tongChan += arr[i];
            } else {
                tongLe += arr[i];
            }
        }
        return tongChan - tongLe;
    }
}
