package ss7_debug_string;

import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "Hello World";
//        Câu a
        System.out.println("a.Lấy ra chữ World: " + str.substring(6));
//        Câu b
        System.out.println("b.Thay o thành f: " + str.replaceAll("o" , "f"));
        // Câu c
        System.out.println("c.Đếm xem có bao nhiêu chữ l: ");
        int count = 0;
        for(int i = 0; i <= str.length() - 1; i++){
            if(str.charAt(i) == 'l'){
                count ++;
            }
        }

        int number = str.length() - str.replaceAll("l" ,"").length();
        System.out.println(str.replaceAll("[^l]" , "").length());
        System.out.println(number);
        System.out.println("Số ký tự l: " +count);

//        Cau d
        System.out.println("d.Vị trí xuất hiện đầu tiên." +str.indexOf('l'));
        System.out.println("Vị trí xuất hiện cuối cùng." +str.lastIndexOf('l'));

//        Cau e
        System.out.println("e.Xoá hết space giữa chúng , đầu tiên và cuối cùng: +" +
                str.replaceAll(" ",""));

//        Cau f
        System.out.println("f.Xoá hết space đầu tiên và cuối cùng (Không được xoá space giữa chừng: "+
                str.trim());

    }
}
