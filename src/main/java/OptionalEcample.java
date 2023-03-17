import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEcample {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();


 liczby.add(3);

        Optional<Integer> liczbyOptional = liczby.stream().map(e -> e.intValue()).findFirst(); // Optional.empty

        System.out.println(liczbyOptional.isEmpty()); // true
        System.out.println(liczbyOptional.isPresent()); // false
        System.out.println("or else"+liczbyOptional.orElse(number())); // 3

        System.out.println("or else get"+liczbyOptional.orElseGet( OptionalEcample::number)); //5



    }
    public static int number(){
        System.out.println("Method number ");
        return 3;
    }
}
