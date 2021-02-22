import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person (2, "Kalle", 20000);

        /*try (Scanner sc = new Scanner(System.in)){
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
        System.out.println(Pattern.matches("\\w*\\d{2}", "tjobidooo11"));
        System.out.println(Pattern.matches("[g-m]+.*\\s[aeiouyåäö]{2}.*", "hej oense"));

        System.out.println(Pattern.matches("[s-v]+.*", "suvt"));
        System.out.println(Pattern.matches("[j-m][a-e]{2}.*", "jaadå"));

        System.out.println(Pattern.matches("[xyz]", "wbcd"));
        System.out.println(Pattern.matches("[xyz]", "x"));
        System.out.println(Pattern.matches("[xyz]", "xxyyyz"));

        Pattern pattern = Pattern.compile("\\Babba|abba\\B");
        Matcher matcher = pattern.matcher("snabba");
        System.out.println("String matches the given pattern " + matcher.matches());
        */
    }
}