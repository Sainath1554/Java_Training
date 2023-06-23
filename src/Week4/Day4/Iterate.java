package Week4.Day4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.addAll(Arrays.asList("Sai","Nath","Korlakunta","Santosh","Puri","Kumar","Santosh Kumar Puri","Sai Nath Korlakunta","Pavan","GG"));
        //Iterator
        Iterator<String> iter = names.iterator();
        System.out.println("Using iterator");
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        System.out.println("----");
        //ForEach
        System.out.println("Using for each");
        names.forEach(System.out::println);

        //Streams for Each
        System.out.println("----");
        System.out.println("Using Streams for each");
        names.stream().forEach(System.out::println);
    }
}
