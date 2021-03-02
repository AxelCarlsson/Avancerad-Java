import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        // ---- LOCALDATE OCH LOCALTIME ------
        LocalTime t = LocalTime.now();
        //System.out.println(t);

        t = LocalTime.of(13, 15, 0);
        //System.out.println(t);

        t = LocalTime.parse("13:56:07");
        //System.out.println(t);

        LocalDate d = LocalDate.now();
        //System.out.println(d);

        d = LocalDate.of(2021, 6, 24);
        //System.out.println(d);

        d = LocalDate.parse("2015-12-24");
        //System.out.println(d);

        LocalDateTime dt = LocalDateTime.now();
        //System.out.println(dt);

        dt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        //System.out.println(dt);

        dt = LocalDateTime.of(2014, Month.FEBRUARY, 2, 10, 30, 15);
        //System.out.println(dt);

        System.out.println(t.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        //System.out.println(d.format(DateTimeFormatter.ofPattern("y-M-d")));
        //System.out.println(dt.format(DateTimeFormatter.ofPattern("y-MM-dd-HH:mm:ss")));

        LocalDateTime ldt = LocalDateTime.now();

        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
        System.out.println("Timezone : " + singaporeZoneId);

        ZonedDateTime asiaZoneDateTime = ldt.atZone(singaporeZoneId);
        System.out.println("Time : " + asiaZoneDateTime);

        String dateInString = "2015-10-01 10:15:55";
        */




/*
        Person person1 = new Person (2, "Kalle", 20000);

        //----- GISSA SLUMPAT NUMMER MELLAN 0-100
        try (Scanner sc = new Scanner(System.in)){
            Random random = new Random();

            int randomNr = random.nextInt(101);
            int count = 0;

            System.out.println("Skriv ett tal 1-100");
            int guess = sc.nextInt();

            int i = 0;
            while (i == 0){
                if (guess == randomNr){
                    count++;
                    i++;
                } else if (guess > randomNr){
                    System.out.println("Lägre!");
                    count++;
                    guess = sc.nextInt();
                } else if (guess < randomNr){
                    System.out.println("Högre!");
                    count++;
                    guess = sc.nextInt();
                }
            }
            System.out.println("Grattis du gissade rätt! Antal gissningar: " + count);

        } catch (Exception InputMismatchException){
            System.out.println("Endast siffror!");
        } */



        /*

        // ------ REG EXPRESSIONS
        System.out.println(Pattern.matches("\\w*\\d{2}", "tjobidooo11"));
        System.out.println(Pattern.matches("[g-m]+.*\\s[aeiouyåäö]{2}.*", "hej oense"));

        System.out.println(Pattern.matches("[s-v]+.*", "suvt"));
        System.out.println(Pattern.matches("[j-m][a-e]{2}.*", "jaadå"));

        System.out.println(Pattern.matches("[xyz]", "wbcd"));
        System.out.println(Pattern.matches("[xyz]", "x"));
        System.out.println(Pattern.matches("[xyz]", "xxyyyz"));

        */
        Pattern pattern = Pattern.compile("\\Babba|abba\\B");
        Matcher matcher = pattern.matcher("snabba");
        System.out.println("String matches the given pattern " + matcher.matches());

    }
}