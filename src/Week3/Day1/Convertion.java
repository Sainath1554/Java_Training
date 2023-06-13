package Week3.Day1;

import java.util.ArrayList;
import java.util.List;

public class Convertion {
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>(List.of(
                "23", "45.67" , "test", "123f"
        ));
        strings.forEach(
                s ->
                {
                    try {
                        int val = Integer.parseInt(s);
                        System.out.println(val);
                    } catch (Exception e)
                    {
                        System.out.println(e);
                    }
                }
        );
    }
}
