import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Axel\\Desktop\\Skolrelaterat\\Avancerad Java\\lektionsKodning\\src\\bands.txt";

        Stream<String> bands = Files.lines(Paths.get(filename));

        bands
                .sorted(a, b) -> a.contains("e") ? 0 : 1))
                .forEach(band -> System.out.println(band));
        bands.close();
    }
}
