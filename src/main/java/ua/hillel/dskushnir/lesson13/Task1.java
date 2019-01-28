package ua.hillel.dskushnir.lesson13;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task1 {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime=ZonedDateTime.now(ZoneId.of("America/Chicago"));
        ZonedDateTime zonedDateTime1=zonedDateTime.withZoneSameInstant(ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
    }
}
