package ss8_stringbuilder_date;

public class DataTypeCasting {
    public static void main(String[] args) {
//        Câu a . Ép kiểu mà độ chính xác kh thay đổi theo thứ từ từ byte đến double
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

//        Câu b . Ép kiểu mà độ chính xác kh bị thay đổi theo thứ tự double đến byte
        double doubleValue2 = 100;
        float floatValue2 = (float) doubleValue2;
        long longValue2 = (long) floatValue2;
        int intValue2 = (int) longValue2;
        short shortValue2 = (short) intValue2;
        byte byteValue2 = (byte) shortValue2;


        //    Câu c. Ép kiểu mà độ chính xác bị thay đổi theo thứ tự  từ double đến byte
        double doubleValue3 = 999999999.9;
        float floatValue3 = (float) doubleValue3;
        long longValue3 = (long) floatValue3;
        int intValue3 = (int) longValue3;
        short shortValue3 = (short) intValue3;
        byte byteValue3 = (byte) shortValue3;
    }

}
