package D231210;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise2Daydiff {
    public Exercise2Daydiff(String nextClassDateStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter.withLocale(Locale.ENGLISH);

        LocalDate nextClassDate = LocalDate.parse(nextClassDateStr, formatter);

        Duration duration = Duration.between(LocalDateTime.now(), nextClassDate.atStartOfDay());

        System.out.printf("The my next SDA class is in %d days", duration.toDays());

    }
}
