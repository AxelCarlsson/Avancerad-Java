import java.util.Arrays;

public class Alphabetically {
    public static void x(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise"};
        Arrays.sort(name, (p1, p2) -> p1.charAt(0) - p2.charAt(0));
        Arrays.asList(name).forEach(System.out::println);
    }
}
