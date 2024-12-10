package exercise;

import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên sản phẩm : ");
        String tenSP = sc.nextLine();
        System.out.print("Nhập vào số lượng : ");
        int soLuong = sc.nextInt();
        System.out.print("Nhập vào đơn giá : ");
        double DonGia = sc.nextDouble();

        double tongTien = soLuong * DonGia;

        double VAT = tongTien * 0.1;

        System.out.println("Tên sản phẩm: "+tenSP);
        System.out.println("Tổng tiền sản phẩm: "+tongTien);
        System.out.println("Thuế VAT: "+VAT);
    }
}
