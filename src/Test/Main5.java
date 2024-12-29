package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so trong mang:");
        String input = scanner.nextLine();

        // chuyen chuoi thanh arrList
        String[] nhapMang = input.split(" ");
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < nhapMang.length; i++) {
            arrList.add(Integer.parseInt(nhapMang[i]));
        }

        System.out.println(timSoLonNhi(arrList));
    }

    public static String timSoLonNhi(ArrayList<Integer> arrList) {
        ArrayList<Integer> danhSach = new ArrayList<>();

        for (int num : arrList) {
            if (!danhSach.contains(num)) { //ktra co trung hay k , neu cs thi false ,
                danhSach.add(num);//ko trung thi them vao mang trung
            }
        }

        if (danhSach.size() < 2) {
            return "Không tìm thấy số lớn nhì";
        }

        int lonNhat = Integer.MIN_VALUE;
        int lonNhi = Integer.MIN_VALUE; // dùng min_value dẻ lay dc so > min

        for (int num : danhSach) {
            if (num > lonNhat) {
                lonNhi = lonNhat;
                lonNhat = num;
            } else if (num > lonNhi) {
                lonNhi = num;
            }
        }

        return String.valueOf(lonNhi);
    }
}
