package Week2.Day2;

public class Rotate {
    public static void rotate(int[] arr,int pos)
    {
        int[] temp = new int[pos];
        for(int i=0;i<pos;i++)
        {
            temp[i] = arr[i];
        }
        for(int i=pos;i<arr.length;i++)
        {
            arr[i-pos] = arr[i];
        }
        int j= 0;
        for(int i=arr.length-pos;i< arr.length;i++)
        {
            arr[i] = temp[j];
            j+=1;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[]{20,4,6,3,10};
        rotate(arr,4);
        for(Integer i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
