public class SecureTester {
    public static boolean alphanumeric(String s){
        boolean matches = s.matches("\\p{Alnum}+");
        System.out.println(matches);
        return matches;
    }
}
