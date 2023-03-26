import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {

            A[i] = sc.nextInt();

        }
        sc.close();
        System.out.println(lastnumberLeft(N, A));
    }


    public static int lastnumberLeft(int N, int[] A) {


        List<Integer> collect = IntStream.of(A).boxed().sorted().collect(Collectors.toList());

        Integer maxInteger = collect.stream().min(Comparator.comparing(Integer::intValue)).get();


        Integer minInteger = collect.stream().max(Comparator.comparing(Integer::intValue)).get();

        int a = 1;
        while (collect.size() == 1) {
            for (int i = A.length - 1; i >= 1; i--) {
                if (i == A[0]) {
                    collect.remove(minInteger);

                } else {
                    collect.remove(maxInteger);
                }
            }
        }
        System.out.println(collect.get(1));
        return collect.get(1);
    }


}
