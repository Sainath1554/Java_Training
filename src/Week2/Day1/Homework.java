package Week2.Day1;

public class Homework {

    //function to reverse a number
    public static int getReverse(int num)
    {
        int rev = 0;
        while(num>0)
        {
            int remainder = num % 10;
            rev = (rev*10) + remainder;
            num = num/10;
        }
        return rev;
    }
    //funtion to return age group
    public static String returnAgeGroup(int age)
    {
        if(age>=13 && age<=19)
        {
            return "teen";
        } else if (age<13) {
            return "kid";
        }
            return "adult";
    }

    // print fibonacci series
    public static void getFibonacci(int n)
    {
        if(n==0)
        {
            System.out.println("0");
        }
        else
        {
            if(n==1)
            {
                System.out.println("0 1");
            }
            else {
                System.out.print("0 1");
                int first = 0;
                int second = 1;
                int i=2;
                while(i<n)
                {
                    int sum = first+second;
                    System.out.print(" "+sum);
                    first = second;
                    second = sum;
                    i+=1;
                }
            }

        }
        System.out.println();
    }

    //fizbuzz program
    public static void fizBuzz()
    {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.print("FizzBuzz ");
            } else if (i%3==0) {
                System.out.print("Fizz ");
            } else if (i%5==0) {
                System.out.print("Buzz ");
            }
            else
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int num = 12345;
        System.out.println("Reverse");
        System.out.println(getReverse(num));
        System.out.println("Age Group");
        System.out.println(returnAgeGroup(8));
        System.out.println("fibonacci");
        getFibonacci(10);
        System.out.println("FizzBuzz");
        fizBuzz();
    }
}
