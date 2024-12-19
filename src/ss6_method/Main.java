package ss6_method;

public class Main {
    public static void main(String[] args) {
        int a = 2, b = 2;
        tinhTong2(a, b);//doi so
        int tong = tinhTong(a, b);
    }

    public static int tinhTong(int a, int b) { //tham so
        int c = a + b;
        return c;
    }

    public static void tinhTong2(int a, int b) {
        int c = a * b;
        System.out.println("Tong: " + c);
    }
}
