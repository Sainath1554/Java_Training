package main.java.Week4.Day5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WorkingDays {
    public static void main(String[] args) {
        LocalDate specificDate = LocalDate.of(2023, 7, 10);
        LocalDate endOfMonth = specificDate.withDayOfMonth(specificDate.lengthOfMonth());
        int workingDays = 0;
        for(LocalDate currentDate = specificDate;!currentDate.isAfter(endOfMonth);currentDate = currentDate.plusDays(1))
        {
            if(currentDate.getDayOfWeek()!=DayOfWeek.SATURDAY && currentDate.getDayOfWeek()!=DayOfWeek.SUNDAY)
            {
                workingDays+=1;
            }
        }
        System.out.println(workingDays);
    }
}
