package ua.hillel.dskushnir.lesson12;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate localDate1 = today.minusMonths(3).minusDays(2);
        System.out.println(localDate1);
        LocalDate payday=today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
        LocalDate paydate2=localDate1.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
        LocalDate paydate3=localDate1.with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY));

        System.out.println(payday);
        System.out.println(paydate2);

        LocalDate nextFriday=today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(nextFriday);
        DayOfWeek dayOfWeek= today.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println();

        boolean leapYaar=LocalDate.now().isLeapYear();
        System.out.println("LeapYear :" + leapYaar);
        LocalDate of1=LocalDate.of(2018,12,20);
        System.out.println(of1);
        LocalDate parse=LocalDate.parse("2018-12-19");
        System.out.println(parse);
      /*  Scanner scanner=new Scanner(System.in);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd");

        String s=scanner.nextLine();

        LocalDate.parse(s,formatter);*/
        System.out.println(paydate3);
        LocalTime now2=LocalTime.now();
        System.out.println(now2.format(DateTimeFormatter.ofPattern("HH::mm")));

        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(now3.format(DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm")));
        System.out.println();

        ZoneId zoneId = ZoneId.of("America/Chicago");
        System.out.println(zoneId);
        ZoneId zoneId1=ZoneId.systemDefault();
        System.out.println(zoneId1);
        System.out.println();

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime now4=ZonedDateTime.now();

        System.out.println(now4);
        ZonedDateTime of=ZonedDateTime.of(now,zoneId);


        LocalDate dateOfB = LocalDate.of(1971,06,22);
        Period p = Period.between(dateOfB,today);
        long daysTotal = ChronoUnit.DAYS.between(dateOfB,today);
        long monthsTotal= ChronoUnit.MONTHS.between(dateOfB,today);
        long yearsTotal=ChronoUnit.YEARS.between(dateOfB,today);
        System.out.println(daysTotal);
        System.out.println(monthsTotal);
        System.out.println(yearsTotal);
        int years=p.getYears();
        int months = p.getMonths();
        int days = p.getDays();
        System.out.println();
        System.out.println(years);
        System.out.println(months);
        System.out.println(days);

        LocalDate.parse("2018-12-20");
        LocalDateTime dateTime= LocalDateTime.of(2018,1,1,0,0);




    }





}
