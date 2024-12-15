package ss5_loop;

import java.util.Scanner;

public class PrintOddnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = sc.nextInt();

        //Cach 1
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " \t");
        }

        //Cach 2
//        for(int i = 1; i <= n; i++){
//            if(i % 2 != 0){
//                System.out.print(i +" \t");
//            }
//       }
    }
}
