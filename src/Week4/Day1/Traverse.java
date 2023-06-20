package Week4.Day1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Traverse {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sai","Nath","Korlakunta");
        // for loop
        for(int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i));
        }
        //enhanced for loop
        for(String s:names)
        {
            System.out.println(s);
        }

        //iterator
        Iterator<String> iter = names.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        //forEach
        names.forEach(System.out::println);

        //parallel Stream
        names.stream().parallel().forEach(System.out::println);
    }
}

