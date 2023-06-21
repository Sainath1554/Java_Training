package Week4.Day2;

import java.util.HashMap;
import java.util.Map;

public class Sum {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60};
        int target = 100;
        HashMap<Integer,Integer> numbersMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            numbersMap.put(nums[i], i);
        }
        for(Map.Entry<Integer,Integer> entry:numbersMap.entrySet())
        {
            int required = target - entry.getKey();
            if(numbersMap.get(required)!=null && required!=entry.getKey())
            {
                int[] res = new int[2];
                res[0] = entry.getValue();
                res[1] = numbersMap.get(required);
                System.out.println(res[0]+" "+res[1]);
                break;
            }
        }
    }
}
