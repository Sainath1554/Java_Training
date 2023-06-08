package Week2.Day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class Anagram {
    public static void main(String[] args)
    {
        String s1 = "test";
        String s2 = "etsa";
        if(s1.length()!=s2.length())
        {
            System.out.println("Not anagram");
        }
        else
        {
            char[] s1C = s1.toCharArray();
            Arrays.sort(s1C);
            char[] s2C = s2.toCharArray();
            Arrays.sort(s2C);
            boolean flag = true;
            for(int i=0;i< s1C.length;i++)
            {
                if(s1C[i]!=s2C[i])
                {
                    flag = false;
                    break;
                }
            }
            if(flag == false)
            {
                System.out.println("Not anagram");
            }
            else
            {
                System.out.println("Anagram");
            }
        }
    }
}
