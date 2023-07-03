package Week2.Day2;

public class Reverse {
    public static void reverseArray(int[] arr)
    {
        int i=0;
        int len = arr.length;
        while(i< len/2)
        {
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp;
            i+=1;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{20,4,6,3,10};
        reverseArray(arr);
        for(Integer i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
