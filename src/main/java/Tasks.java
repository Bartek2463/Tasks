import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {
    public String order(String words) {

        String s1 = Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("[^0-9]",""))))
                .reduce((a, b) -> a + " " + b).get();
        System.out.println(s1);
        return s1;
    }
}
