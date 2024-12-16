package ss5_loop;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai canh hinh vuong: ");
        int canh = sc.nextInt();

        for(int i = 1; i <= canh; i++) {
            for(int j = 1; j <= canh; j++) {
                if(i == 1 || i == canh || j == canh || j == 1){
                    System.out.print("* ");
                }else{
                    System.out.println("  ");
                }
            }
            System.out.println();
        }
    }
}
