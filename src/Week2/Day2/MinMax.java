package Week2.Day2;

public class MinMax {
    public static void evaluateMinMax(int[] arr)
    {
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("Smallest number: "+ min+"\n"+"Largest number: "+max);
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{20,4,6,3,10};
        evaluateMinMax(arr);
    }
}
