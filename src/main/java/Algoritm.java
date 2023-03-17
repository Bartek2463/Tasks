import java.util.Enumeration;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Algoritm {

    public static long fib(int arg) {
        if (arg == 0) return 0;
        else if ((arg == 1) || (arg == 2))
            return 1;
        else return fib(arg - 1) + fib(arg - 2);


    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if ((n == 1) || n == 2) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibInteration(int n) {
        if (n == 0) return 0;
        if (n <= 1) return n;

        int result = 1;
        int currentValue = 1;
        int previousValue = 0;
        for (int i = 1; i < n; i++) {
            result = previousValue + currentValue;
            currentValue = previousValue;
            previousValue = result;
        }
        return result;

    }

    public static int fib2Iteration(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            b = b + a;
            a = b - a;
        }
        System.out.println(a);
        return a;
    }

    public static int silnia(int n) {
        return n < 2 ? 1 : n * silnia(n - 1);
    }

    public static int silniaIteration(int n) {
        if (n == 0) throw new IllegalArgumentException("Bad argument");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static String FizzBuzz(int number) {

        for (int i=1; i<=number;i++){
          if (i%3==0){
              if(i%5==0){
                  System.out.println("FizzBuzz");
              }else {
                  System.out.println("Fizz");
              }
          }else if (i%5==0){
              System.out.println("Buzz");
          }else {
              System.out.println(i);
          }
      }
        return String.valueOf(number);
    }


}
