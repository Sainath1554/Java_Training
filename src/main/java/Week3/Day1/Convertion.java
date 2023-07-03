package Week3.Day1;

import java.util.ArrayList;
import java.util.List;

public class Convertion {
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>(List.of(
                "23", "45.67" , "test", "123f"
        ));
//        strings.forEach(
//                s ->
//                {
//                    try {
//                        int val = Integer.parseInt(s);
//                        System.out.println(val);
//                    } catch (Exception e)
//                    {
//                        System.out.println(e);
//                    }
//                }
//        );
        for(int i=0;i<strings.size();i++)
        {
            try {
                convert(strings.get(i));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("Hello");
    }
    static void convert(String s) throws Exception
    {
        int val = Integer.parseInt(s);
    }
}
