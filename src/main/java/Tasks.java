import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {
    public String order(String words) {
        return Arrays.stream(words.replaceAll("[^a-z]", "").split(""))
                .sorted(Comparator.comparing(String::toString)).distinct().reduce(String::concat).get();

    }
    public String orderInteger(String words){
        List<String> collect = Arrays.stream(words.split(""))
                .sorted(Comparator.comparing(String::toString))
                .collect(Collectors.toList());


        System.out.println(collect);

        return null;
    }

    public static String oddOrEven (int[] array) {
        return array.length==0? new int[]{0}:

    }
}
