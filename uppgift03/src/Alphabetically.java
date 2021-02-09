import java.util.Arrays;
import java.util.Comparator;

public class Alphabetically {
    public static void x(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise"};
        Arrays.sort(name, Comparator.comparingInt(p -> p.charAt(0)));
        Arrays.asList(name).forEach(System.out::println);
    }
}
