package main.java.Week4.Day5;

import java.util.Optional;

public class OptionalStringUpper {
    public static void main(String[] args) {
        String str = new String("Sai Nath");
        Optional<String> result = toUpperCas(str);
        if(!result.isEmpty())
        {
            System.out.println(result.orElse(null));
        }
        else {
            System.out.println(result);
        }
    }
    public static Optional<String> toUpperCas(String s)
    {
        if(s==null)
        {
            return Optional.empty();
        }
        return Optional.of(s.toUpperCase());
    }
}
