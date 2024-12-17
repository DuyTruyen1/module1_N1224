package ss5_loop;

public class NumberOfSatisfaction {
    public static void main(String[] args) {
        System.out.println("Cac so thoa man dieu kien.");

        for (int i = 10; i <= 99; i++) {
            int tensDigit = i % 10;
            int onesDigit = i / 10;

//            Tinh tong
            int sum = tensDigit + onesDigit;
            int multiplication = tensDigit * onesDigit;

            if (multiplication == 2 * sum) {
                System.out.println(i);
            }
        }
    }
}
