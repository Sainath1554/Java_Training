package Week1.Day5.P3;

public class Count {
    static int counter;
    static
    {
        counter = returnCounter();
    }
    public static int returnCounter()
    {
        return 10;
    }
    public static void main(String[] args)
    {
        System.out.println(Count.counter);
    }
}
