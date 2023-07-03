package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<String> names =Arrays.asList("Sai","Nath","Sai");
        Set<String> namedSet = names.stream().collect(Collectors.toSet());
        namedSet.addAll(Arrays.asList("Korl","Kor"));
        System.out.println(namedSet);
    }
}
