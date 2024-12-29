package Test;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Câu 4");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so luong phan tu trong mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap vao mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prime = findPrime(arr);
        System.out.println("cac so nguyen to trong mang la: ");
        for (int i = 0; i < prime.length; i++) {
            System.out.println(prime[i]);
        }
    }

    //ktra so nguyen to
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    //Tìm ngto

    public static int[] findPrime(int[] n) {
//        đếm số ngto
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (isPrime(n[i])) {
                count++;
            }
        }

//        tạo 1 mảng để chứa ngto
        int[] primes = new int[count];
        int x = 0;

//        lưu vào mảng
        for (int i = 0; i < n.length; i++) {
            if (isPrime(n[i])) {
                primes[x] = n[i];
                x++;
            }
        }
        return primes;
    }
}
