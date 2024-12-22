package ss8_stringbuilder_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ConvertDatetime {
    public static void main(String[] args) throws ParseException {
//        Câu A chuyển chuỗi sang kiểu java.ultil.date
        String dateStr = "02/08/2003";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(dateStr);
        System.out.println("Java.ulti.Date: " + date);

//        Câu B chuyển ngày hiện tại sang kiểu String
        Date currentDate = new Date();// Lấy ra ngày hiện tại
        String formattedDate = sdf.format(currentDate);
        System.out.println("Ngay da dinh dang: " + formattedDate);

//         Câu C Chuyển chuỗi 02/08/2003 sang kiểu localDate

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dateStr, formatter);
        System.out.println("LocalDate: " + localDate);

//        Câu D chuyển ngày hiện tại đang ở kiểu LocalDate sang kiểu String

        LocalDate nowDate = LocalDate.now();
        String formartterDate = nowDate.format(formatter);
        System.out.println("Ngày đã định dạng: " + formartterDate);

//        Câu E. Lấy ngày , tháng , năm , giờ , phút , giây trong hê thống

        LocalDateTime currentDateTime = LocalDateTime.now();
        int day = currentDateTime.getDayOfMonth();
        int month = currentDateTime.getMonthValue();
        int year = currentDateTime.getYear();
        int hour = currentDateTime.getHour();
        int minute = currentDateTime.getMinute();
        int second = currentDateTime.getSecond();

        System.out.println("Ngày: " + day);
        System.out.println("Tháng: " + month);
        System.out.println("Năm: " + year);
        System.out.println("Giờ: " + hour);
        System.out.println("Phút: " + minute);
        System.out.println("Giây: " + second);

//        Câu F . Cho biết 1 tháng sau (tính từ hiện tại)
//        sẽ rơi vào thứ mấy trong tuần và cách ngày hiện tại bao nhiêu ngày

        LocalDate oneMonthlater = nowDate.plusMonths(1);

        // In ra thứ trong tuần sau 1 tháng
        System.out.println("Một tháng sau sẽ rơi vào thứ: " + oneMonthlater.getDayOfWeek());

//        Tính số ngày chênh lệch

        Long daysUntilOneMonthLater = nowDate.until(oneMonthlater, ChronoUnit.DAYS);

//        ChronoUnit để tính số thời điểm chênh lệch giữa ngày hiện tài và ...
        System.out.println("Một tháng sau : " + oneMonthlater);

        System.out.println("Số ngày đến một tháng sau: " + daysUntilOneMonthLater);

//        Câu G.Cách đây 1000 ngày là ngày tháng năm nào

        LocalDate  futureDate = nowDate.plusDays(1000);
        System.out.println("Ngày  tương lai: " + futureDate);


//        Câu H . Nhập vào 2 chuỗi , chuyển hết thành LocalDate , sau đó tính ngày chênh lệch
        String date1 = "02/08/2003";
        String date2 = "20/12/2024";

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(date1, formatter1);
        LocalDate localDate2 = LocalDate.parse(date2, formatter1);

        long daysDifference = localDate1.until(localDate2, ChronoUnit.DAYS);
        System.out.println("Số ngày chệnh lệch: " + daysDifference);


//        CâU I . Nhập vào String , sau đó Nhập vào số tự nhiên n , in ra ngày đứng sau ngày đã nhập n ngày
       String dateST = "02/08/2003";
       int n = 10;
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate localDateST = LocalDate.parse(dateST, fmt);
       LocalDate futureDateST = localDateST.plusDays(n);

        System.out.println("Ngày sau " + n + " ngày " + futureDateST.format(fmt));
    }
}
