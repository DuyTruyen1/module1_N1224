package ss6_method;

public class Main2 {
    public static void main(String[] args) {
        //Trong java kh co tham chieu , chi co tham tri
        int a = 2;
        changeData(a);
        //Không bao giờ thay đổi được
        System.out.println(a);
//        Tham trị:gia tri khong thay doi khi ra khỏi hàm
//        Tham chiều:Giá trị thay đổi khi ra khỏi hàm => k có trong java
    }

    public static void changeData(int x) {
        x = 100;
    }
}
