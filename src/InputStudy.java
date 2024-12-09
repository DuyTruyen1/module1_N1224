import java.time.Year;
import java.util.Scanner;

public class InputStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Nhập vào tuổi của bạn: ");
//        int age = sc.nextInt();
//
//        int year = Year.now().getValue();
//        //how to....in java
//
//        int s = year - age;
//
//        System.out.println("Tuổi của bạn là : " + s);

//           System.out.print("Nhập vào số nguyên A: ");
//           int a = sc.nextInt();
//           System.out.print("Nhập vào số nguyên B: ");
//           int b = sc.nextInt();
//
//           int sum = a + b;
//           int difference = a - b;
//           int Multiplication = a * b;
//           double Division = ((double) a / b);
//
//        System.out.println("Phép cộng :"+ sum);
//        System.out.println("Phép trừ :"+ difference);
//        System.out.println("Phép nhân :"+ Multiplication);
//        System.out.println("Phép Chia :"+ Division);

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
