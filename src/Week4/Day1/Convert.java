package Week4.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Convert {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sai","Nath","Korlakunta");
        // toArray method takes as argument a new array and copies the list to the array
        String[] arrNames = names.toArray(new String[names.size()]);
        for(int i=0;i<arrNames.length;i++)
        {
            System.out.println(arrNames[i]);
        }
    }
}
