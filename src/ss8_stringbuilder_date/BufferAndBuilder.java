package ss8_stringbuilder_date;

public class BufferAndBuilder {
    public static void main(String[] args) {
        String input = "Hello World";

//        Câu a
        StringBuffer sb = new StringBuffer(input);
        String result1 = sb.substring(6);

        StringBuilder sd = new StringBuilder(input);
        String result2 = sd.substring(6);

        System.out.println("Ket qua cau A su dung StringBuffer: " + result1);
        System.out.println("Ket qua cau A su dung StringBuilder: " + result2);

//        Câu b
        sb.replace(4,5,"f");
        sd.replace(4,5,"f");
        System.out.println("Ket qua cau B su dung StringBuffer: " + sb);
        System.out.println("Ket qua cau B su dung StringBuffer: " + sd);

//        Câu c
        String str1 = "Hello";
        String str2 = "World";
        String resultC1 = str1.concat(str2);

        sb.append(str2);
        String resultC2 = sb.toString();

        sd.append(str2);
        String resultC3 = sd.toString();

        System.out.println("Ket qua su dung String : " + resultC1);
        System.out.println("Ket qua su dung StringBuffer : " + resultC2);
        System.out.println("Ket qua su dung StringBuilder : " + resultC3);

//        Câu d
        String a = "A";
        String b = new String("A");
        String c = "A";

        b.concat("B");
        String d = c.concat("C");

        StringBuffer e = new StringBuffer("E");
        e.append("F");

        StringBuilder g = new StringBuilder("G");
        g.append("H");

        System.out.println(a + b + c + d + e + g);

//        Câu e

        String strE1 = "Hello";
        String strE2 = new String("Hello");
        String strE3 = "Hello";

        System.out.println("So sanh String.");
        System.out.println("strE1.equals(strE2): "+ strE1.equals(strE2));
        System.out.println("strE1 == strE2: " + (strE1 == strE2));
        System.out.println("strE1 == strE3: " + (strE1 == strE3));
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println("----------- So sánh StringBuffer -------------.");
        System.out.println("sb1.equals(sb2): "+ sb1.equals(sb2));
        System.out.println("sb1 == sb2: " + (sb1 == sb2));

//        So sánh bang method equals và toán tử == cho StringBuffer

        StringBuilder sd1 = new StringBuilder("Hello");
        StringBuilder sd2 = new StringBuilder("Hello");

        System.out.println("------------- So sánh StringBuilder ---------");
        System.out.println("sd1.equals(sd2): "+ sd1.equals(sd2));
        System.out.println("sd1 == sd2: " + (sd1 == sd2));


    }
}
