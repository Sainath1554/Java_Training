package Week3.Day5;

import javax.xml.stream.util.StreamReaderDelegate;
import java.util.Arrays;
import java.util.stream.Stream;

public class SortStrings {
    public static void main(String[] args)
    {
        String[] names = {"Sai","Nth","Kor","Sa"};
        Arrays.sort(names,(o1, o2)->
        {
            if(o1.length()>o2.length())
            {
                return 1;
            } else if (o1.length()==o2.length()) {
                if(o1.charAt(o1.length()-1)>o2.charAt(o2.length()-1))
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            } else
            {
                return -1;
            }
        });
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
}
