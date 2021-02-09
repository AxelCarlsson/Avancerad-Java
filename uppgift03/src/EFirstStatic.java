import java.util.Arrays;
import java.util.Comparator;

public class EFirstStatic {
    


    public static void x(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise", "Elsa", "Erik"};
        Arrays.sort(name, (s1, s2) -> Utils.yourMethod(s1, s2));




        /*Arrays.sort(name, Comparator.comparingInt(a -> (a.contains("E") ? 0 : 1)));
        for(String names : name)
            System.out.println(names);
    */

    }
}
