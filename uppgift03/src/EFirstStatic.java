import jdk.jshell.execution.Util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class EFirstStatic {
    public static void x(){

        String[] name = { "Denise", "Saleh", "Felicia", "Tony", "Axel", "Benjamin", "Elin" };

        Arrays.sort(name, EFirstStatic::YourMethod);
        for(String names : name)
            System.out.println(names);
    }

    public static int YourMethod(String s1, String s2) {

        return s2.contains("E") ? 0 : 1;

    }

}


