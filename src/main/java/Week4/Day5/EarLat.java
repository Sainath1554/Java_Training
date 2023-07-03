package main.java.Week4.Day5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EarLat {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 7, 1),
                LocalDate.of(2023, 7, 5),
                LocalDate.of(2023, 7, 3),
                LocalDate.of(2023, 7, 2)
        );
        LocalDate earliest = dates.stream().min((date1,date2)->date1.compareTo(date2)).orElse(null);
        LocalDate latest = dates.stream().max((date1,date2)->date1.compareTo(date2)).orElse(null);
        System.out.println("Earliest is "+earliest);
        System.out.println("Latest is "+latest);
    }
}
