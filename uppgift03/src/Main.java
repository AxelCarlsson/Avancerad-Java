import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        length();
        /*reverseLength();
        alphabetically();
        eFirst();
        eFirstStatic();*/

    }

    public static void length(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise"};
        Arrays.sort(name, Comparator.comparingInt(String::length));
        Arrays.asList(name).forEach(System.out::println);
    }

    public static void reverseLength(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise"};
        Arrays.sort(name, (p1, p2) -> p2.length() - p1.length());
        Arrays.asList(name).forEach(System.out::println);
    }

    public static void alphabetically(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise"};
        Arrays.sort(name, Comparator.comparingInt(p -> p.charAt(0)));
        Arrays.asList(name).forEach(System.out::println);
    }

    public static void eFirst(){
        String[] name = {"Tony", "Benjamin", "Felicia", "Saleh", "Axel", "Denise", "Elsa", "Erik"};
        Arrays.sort(name, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
        for(String names : name)
            System.out.println(names);
    }

    public static void eFirstStatic(){

        String[] name = { "Denise", "Saleh", "Felicia", "Tony", "Axel", "Benjamin", "Elin" };

        Arrays.sort(name, Main::YourMethod);
        for(String names : name)
            System.out.println(names);
    }

    public static int YourMethod(String s1, String s2) {

        return s2.contains("E") ? 0 : 1;

    }
}

