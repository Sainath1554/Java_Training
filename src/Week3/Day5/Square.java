package Week3.Day5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Square {
    public static void main(String[] args)
    {
        int[] numbers = {-99,1,2,3,4,5,6,7,8,9};
        double val = IntStream.of(numbers).filter(num->num%2==1).map(s->s*s).average().orElse(0);
        System.out.println(val);
    }
}
