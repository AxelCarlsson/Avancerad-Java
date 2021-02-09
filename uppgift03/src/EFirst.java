import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EFirst {
    public static void x(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise", "Elsa", "Erik"};
        Arrays.sort(name, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
        for(String names : name)
            System.out.println(names);


    }
}
