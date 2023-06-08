package Week2.Day3;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args)
    {
        String s = "Java J2EE Reverse Me";
        String[] split = s.split(" ");
        s ="";
        for(String s1:split)
        {
            char[] c = s1.toCharArray();
            int length = c.length;
            int i=0;
            while(i<length/2)
            {
                char temp = c[i];
                c[i] = c[length-i-1];
                c[length-i-1] = temp;
                i+=1;
            }
            for(int j=0;j<c.length;j++)
            {
                s+=c[j];
            }
            s+=" ";
        }
        s.trim();
        System.out.println(s);
    }
}
