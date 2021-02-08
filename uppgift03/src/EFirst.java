import java.util.Arrays;

public class EFirst {
    public static void x(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise", "Erik", "Elsa"};
        Arrays.sort(name, (p1, p2) -> p1.charAt(0) - p2.charAt(0));
        Arrays.asList(name).forEach(System.out::println);
    }
}
