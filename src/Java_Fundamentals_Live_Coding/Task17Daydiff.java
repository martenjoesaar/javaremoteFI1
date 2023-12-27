package Java_Fundamentals_Live_Coding;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task17Daydiff {
    public Task17Daydiff(String nextClassDateStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter.withLocale(Locale.ENGLISH);

        LocalDate nextClassDate = LocalDate.parse(nextClassDateStr, formatter);

        Duration duration = Duration.between(LocalDateTime.now(), nextClassDate.atStartOfDay());

        System.out.printf("The next SDA class is in %d days", duration.toDays());

    }
}
/*
Write an application that will read from the user the date of your next SDA classes and
calculate how many days are left to them.
Hint: read the date as String and parse it to LocalDate. Get the current date using
LocalDate.now() method.
 */