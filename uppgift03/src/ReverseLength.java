import java.util.Arrays;

public class ReverseLength {
    public static void x(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise"};
        Arrays.sort(name, (p1, p2) -> p2.length() - p1.length());
        Arrays.asList(name).forEach(System.out::println);
    }
}
