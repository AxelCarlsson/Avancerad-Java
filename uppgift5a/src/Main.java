import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Axel\\Desktop\\Skolrelaterat\\Avancerad Java\\uppgift5a\\src\\temp.txt";

        OptionalDouble min = Files
                .lines(Paths.get(filename))
                .map(str -> str.replace(",", "."))
                .mapToDouble(num -> Double.parseDouble(num))
                .min();

        System.out.println("Minsta: " + min);

        OptionalDouble max = Files
                .lines(Paths.get(filename))
                .map(str -> str.replace(",", "."))
                .mapToDouble(num -> Double.parseDouble(num))
                .max();

        System.out.println("Största: " + max);

        OptionalDouble average = Files
                .lines(Paths.get(filename))
                .map(str -> str.replace(",", "."))
                .mapToDouble(num -> Double.parseDouble(num))
                .average();

        System.out.println("Medeltalet: " + average);





        /*System.out.println("Highest Temperature");
        highestTemp();
        System.out.println("Lowest Temperature");
        lowestTemp();
        System.out.println("Average Temperature");
        averageTemp();*/
    }

    /*public static void highestTemp() throws IOException {
        String filename = "C:\\Users\\Axel\\Desktop\\Skolrelaterat\\Avancerad Java\\uppgift5a\\src\\temp.txt";

        Stream<String> rows2 = Files.lines(Paths.get(filename));
        rows2
                .map(x -> x.split(","))
                .filter(x -> Double.parseDouble(x[0]) + (Double.parseDouble(x[1]) / 10) > 17.4 )
                .forEach(x -> System.out.println(x[0] + "," + x[1]));
        rows2.close();
    }

    public static void lowestTemp() throws IOException {
        String filename = "C:\\Users\\Axel\\Desktop\\Skolrelaterat\\Avancerad Java\\uppgift5a\\src\\temp.txt";

        Stream<String> rows2 = Files.lines(Paths.get(filename));
        rows2
                .map(x -> x.split(","))
                .filter(x -> Double.parseDouble(x[0]) + (Double.parseDouble(x[1]) / 10) < 6.5 )
                .forEach(x -> System.out.println(x[0] + "," + x[1]));
        rows2.close();
    }
    public static void averageTemp() throws IOException{
        String filename = "C:\\Users\\Axel\\Desktop\\Skolrelaterat\\Avancerad Java\\uppgift5a\\src\\temp.txt";

        Stream<String> rows2 = Files.lines(Paths.get(filename));
        rows2
                .map(x -> x.split(","))
                .filter(x -> Double.parseDouble(x[0]) + (Double.parseDouble(x[1]) / 10) < 6.5 )
                .forEach(x -> System.out.println(x[0] + "," + x[1]));
        rows2.close();
    }*/
}