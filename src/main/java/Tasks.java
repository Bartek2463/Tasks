import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.Arrays.stream;
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

    public  String oddOrEven (int[] array) {
        int sum = IntStream.of(array).sum();
        return sum%2==0||array.length==0 ? "even": "add";
    }


    public  String oddOrEven1 (int[] array) {
        return stream(array).sum()%2==0 ?"even":"odd";
    }

}
