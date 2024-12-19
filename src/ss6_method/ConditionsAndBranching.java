package ss6_method;

public class ConditionsAndBranching {
    public class Main {
        public static char toLowerCase(char inputChar) {
            if (inputChar >= 'A' && inputChar <= 'Z') {
                return (char) (inputChar + 32);
            }
            return inputChar; // Trả về ký tự ko đổi nếu ko phải ký tự hoa
        }

        public static void levelOne(double a, double b) {
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -b / a;
                System.out.println("Nghiệm của phương trình là: x = " + x);
            }
        }

        public static void levelTwo(double a, double b, double c) {
            if (a == 0) {
                levelOne(b, c); // Chuyển về ptr bậc nhất nếu a = 0
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("Phương trình vô nghiệm.");
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Phương trình có nghiệm kép: x = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
                }
            }
        }

        public static int min(int a, int b, int c, int d) {
            int min = a;
            if (b < min) min = b;
            if (c < min) min = c;
            if (d < min) min = d;
            return min;
        }

        public static void main(String[] args) {
            // Kiểm tra phương thức toLowerCase
            System.out.println("Chuyển 'A' thành: " + toLowerCase('A'));
            System.out.println("Chuyển 'z' thành: " + toLowerCase('z'));

            // Kiểm tra phương thức levelOne
            System.out.println("\nGiải phương trình bậc nhất 2x + 3 = 0:");
            levelOne(2, 3);

            // Kiểm tra phương thức levelTwo
            System.out.println("\nGiải phương trình bậc hai x^2 - 5x + 6 = 0:");
            levelTwo(1, -5, 6);

            // Kiểm tra phương thức min
            System.out.println("\nGiá trị nhỏ nhất trong các số 4, 2, 7, 1 là: " + min(4, 2, 7, 1));
        }
    }
}
