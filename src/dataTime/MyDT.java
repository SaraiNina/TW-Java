package dataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class MyDT {


    public static void main(String[] args) {
       LocalDate now = LocalDate.now();
       now = now.plusDays(10);
        LocalDate of1 = LocalDate.of(2000,05,20);
        LocalDate of2 = LocalDate.of(2000, Month.MAY,31);
        LocalDate of3 = LocalDate.parse("2000-01-20");
        LocalDate max = LocalDate.MAX;
       LocalTime localTime = LocalTime.of(21, 50, 10, 20);
        LocalTime now1 = LocalTime.now();
        LocalTime noon = LocalTime.NOON;
        System.out.println(noon);
    }

}
