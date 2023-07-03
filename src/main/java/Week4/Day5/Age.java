package main.java.Week4.Day5;

import java.time.LocalDate;
import java.time.Period;

public class Age {
    public static void main(String[] args) {
        String dob  = "1991-11-25";
        LocalDate birthdate = LocalDate.parse(dob);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        System.out.println("Age: " + age.getYears() + " years");
    }
}
