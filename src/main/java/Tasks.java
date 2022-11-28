import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {
    public String order(String words) {
        String s = Arrays.stream(words.replaceAll("[^a-z]", "").split(""))
                .sorted(Comparator.comparing(String::toString)).distinct().reduce(String::concat).get();
        System.out.println(s);
        return s;

    }
    public String orderInteger(String words){
        String s = Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(e -> Integer.valueOf(e.replaceAll("[^0-9]", ""))))
                .reduce((a, b) -> a + " " + b).get();
        System.out.println(s);
        return s;
    }
}
