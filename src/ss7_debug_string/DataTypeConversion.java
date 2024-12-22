package ss7_debug_string;

public class DataTypeConversion {
    public static void main(String[] args) {
//        a.Chuyen doi String thanh int
        String aSt = "4000";
        int a = Integer.parseInt(aSt);

//        b. chuyen doi int thanh String trong java
        String bSt = String.valueOf(a);

//        c. Chuyen doi String thanh Long

        String cSt = "12345678900";
        long c = Long.parseLong(cSt);

//        d.chuyen dong long thanh string
        String d = String.valueOf(c);

//        e.Chuyen doi String thanh float
        String eSt = "44.4f";
        float e = Float.parseFloat(eSt);

//        f. chuyen float thanh string
        String f = String.valueOf(e);

//        g. Chuyen string thanh double
        String gSt = "10.00";
        double g = Double.parseDouble(gSt);

//         h.Chuyen double thanh string
        String hSt = String.valueOf(g);

//        i. chuyen doi String thanh short
        String iSt = "100";
        Short i = Short.parseShort(iSt);

//        k.Chuyen short thanh String
        String k = String.valueOf(i);
    }

}
