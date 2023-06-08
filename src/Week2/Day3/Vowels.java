package Week2.Day3;

public class Vowels {
    public static void main(String[] args)
    {
        String s = "abcdei";
        int val = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
            {
                val +=1;
            }
        }
        System.out.println(val);
    }
}
