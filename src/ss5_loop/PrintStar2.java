package ss5_loop;

import java.util.Scanner;

public class PrintStar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai canh hinh vuong: ");
        int canh = sc.nextInt();

//        Hinh A
        System.out.println("Hinh A");
        for(int i = 1; i <= canh; i++) {
            for(int j = 1; j <= canh; j++){
                if(i == 1 || i == canh || j == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


//        Hinh B
        System.out.println("Hinh B");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || i == canh || j == canh) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

//        Hinh C
        System.out.println("Hinh C");
        for(int i = 1; i<= canh; i++){
            for(int j = 1; j <= canh; j++){
                if(i == canh || j == 1 || j == canh){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

