package Week4.Day2;

import java.util.HashMap;
import java.util.Map;

public class Distinct {
    public static void main(String[] args) {
        String input = "test string";
        HashMap<Character,Integer> result= new HashMap<>();
        compute(input.toLowerCase(),result);
        for(Map.Entry<Character,Integer> entry:result.entrySet())
        {
            System.out.println(entry.getKey()+" :"+entry.getValue());
        }
    }
    public static void compute(String inputString,HashMap<Character,Integer> result)
    {
        for(int i=0;i<inputString.length();i++)
        {
            char s = inputString.charAt(i);
            if(s==' ')
            {
                continue;
            }
            if(result.keySet().contains(s))
            {
                result.put(s,result.get(s)+1);
            }
            else
            {
                result.put(s,1);
            }
        }
    }
}
