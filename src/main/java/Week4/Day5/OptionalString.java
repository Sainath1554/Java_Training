package main.java.Week4.Day5;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        String str = new String("Sai Nath");
        Optional<Integer> result = returnLen(str);
        if(!result.isEmpty())
        {
            System.out.println(result.orElse(0));
        }
        else {
            System.out.println(result);
        }
    }

    public static Optional<Integer> returnLen(String s)
    {
        if(s==null)
        {
            return Optional.empty();
        }
        return Optional.of(s.length());
    }
}
