package Test;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ky tu: ");
        String n = sc.nextLine();

        int ketQua = demKyTuHoa(n);

        if(ketQua == 0){
            System.out.println("Chuoi khong chua ky tu in hoa");
        }else{
            System.out.println("So luong ky tu hoa trong chuoi: " + ketQua);
        }

    }

    public static int demKyTuHoa(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        return count;
    }
}
