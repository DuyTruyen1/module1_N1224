package ss5_loop;

import java.util.Scanner;

public class PrintNumbersEven1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số n: ");
        int n = sc.nextInt();
//        for(int i = 2; i <= n; i += 2){
//            if(i % 4 == 0){
//                System.out.print(-i + " ");
//            }else{
//                System.out.print(i + " ");
//            }
//        }

//        B1
//        for (int i = 2; i <= n; i += 2) {
//            if (i % 6 == 0) {
//                System.out.println(-1 + "");
//            } else {
//                System.out.println(i + "");
//            }
//        }


//        B2
        int x = 3;
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            count++;

            if (count == x) {
                System.out.println(-i + "");
                count = 0;
            } else {
                System.out.println(i + "");
            }
        }
    }
}
