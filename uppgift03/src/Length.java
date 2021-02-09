import java.util.Arrays;
import java.util.Comparator;

public class Length {
    public static void x(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise"};
        Arrays.sort(name, Comparator.comparingInt(String::length));
        Arrays.asList(name).forEach(System.out::println);
    }

}
