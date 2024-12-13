package ss3_java_overview;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào điểm toán : ");
        double diemToan = sc.nextDouble();
        System.out.print("Nhập vào hệ số toán : ");
        double hsToan = sc.nextDouble();


        System.out.print("Nhập vào điểm lý : ");
        double diemLy = sc.nextDouble();
        System.out.print("Nhập vào hệ số lý : ");
        double hsLy = sc.nextDouble();


        System.out.print("Nhập vào điểm hoá : ");
        double diemHoa = sc.nextDouble();
        System.out.print("Nhập vào hệ số hoá : ");
        double hsHoa = Double.parseDouble(sc.nextLine());

        double diemTB = (diemToan * hsToan * diemLy * hsLy * diemHoa * hsHoa) / (hsToan * hsLy * hsHoa);

        System.out.println("Điểm TB: "+diemTB);

    }
}
