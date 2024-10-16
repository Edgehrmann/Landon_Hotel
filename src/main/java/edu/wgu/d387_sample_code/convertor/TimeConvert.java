package edu.wgu.d387_sample_code.convertor;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
public class TimeConvert {
    public static List<String> getTime() {

        ZonedDateTime time = ZonedDateTime.now();
        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        String timePattern = "hh:mm a";
        DateTimeFormatter timePatternFormatter = DateTimeFormatter.ofPattern(timePattern);

        List<String> times = new ArrayList<>();
        times.add("Join us for our next online live event at Eastern Time: " + time.format(timePatternFormatter));
        times.add("Mountain Time: " + MT.format(timePatternFormatter));
        times.add("UTC Time: " + UTC.format(timePatternFormatter));

        return times;
    }
}