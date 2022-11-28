import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tasks {
    public String order(String words) {

        String s = Arrays.stream(words.replaceAll("[^a-z]", "").split(""))
                .sorted(Comparator.comparing(String::toString)).distinct().reduce(String::concat).get();

        System.out.println(s);


        return null;

    }
}
