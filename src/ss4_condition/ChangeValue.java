package ss4_condition;

public class ChangeValue {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

//        use variable temp
//        int temp = a;
//        a = b;
//        b = temp;
//


//        use temp
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
