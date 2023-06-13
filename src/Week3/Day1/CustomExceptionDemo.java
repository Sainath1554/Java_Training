package Week3.Day1;

import java.util.Arrays;

public class CustomExceptionDemo {
    public static void main(String[] args)
    {
        try {
            divide(10, 0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void divide(int operand1, int operand2) throws Exception
    {
        int result;
        try{
            result = operand1/operand2;
            System.out.println(result);
        }
        catch(Exception e)
        {
            throw new ArithmenticException("Division by 0 is not allowed");
        }
    }
}

class ArithmenticException extends Exception
{
    ArithmenticException(String message)
    {
        super(message);
    }
}

