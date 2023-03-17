public class Troll {
    public  String disemvowe(String str){
        return str.replaceAll("[aeiouAEIOU]","");


    }
    public static  boolean isSquare(int sqrt){

        double sqrt1 = Math.sqrt(sqrt);
        System.out.println(sqrt1);
        boolean b = sqrt1 % 1 == 0;
        System.out.println(b);
        return b;


    }
    public static int silnia(int n){
       int result =1;
       for (int i=1;i<=n;i++){
           result*=i;
       }
       return result;
    }
    public static int fib(int n){
        int result =1;
        int currentValue =1;
        int previousValue =0;
        for(int i=2;i<n;i++){
            result=currentValue+previousValue;
            previousValue=currentValue;
            currentValue=result;
            System.out.println(result);
        }
        return result;
    }
}
