import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExampleOfinnerOuterClass {
    public static void main(String[] args) {

        String test = "jest";
        System.out.println("Test variable: "+test);

        System.out.println("or else");
        String s = Optional.ofNullable(test).orElse(getDefault());
        System.out.println("Optional.ofNullable(test).orElse(getDefault())"+s);

        System.out.println("------------------------------");
        System.out.println("Or else get");
        String s1 = Optional.ofNullable(test).orElseGet(ExampleOfinnerOuterClass::getDefault);

        System.out.println("Optional.ofNullable(test).orElseGet(ExampleOfinnerOuterClass::getDefault)"+s1);


    }
    private static String getDefault(){
        System.out.println("Main.getDefault() method has been invoked");
        return "default";
    }
}



