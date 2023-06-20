package Week4.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveLast {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Sai","Nath","Korlakunta"));
        names.remove(names.size()-1);
        System.out.println(names);
    }
}
