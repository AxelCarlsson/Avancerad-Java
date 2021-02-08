import java.util.Arrays;

public class Length {
    public static void x(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise"};
        Arrays.sort(name, (p1, p2) -> p1.length() - p2.length());
        Arrays.asList(name).forEach(System.out::println);
    }

}
