import java.time.Duration;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // skapa slumpad siffra 5-15
        int r = (int) (Math.random() * (15 - 5)) + 5;

        System.out.println("Försök stanna programmet efter "+ r +" sekunder");
        long bestResult = 1000;

        // loopar programmet
        int i = 0;
        while (i == 0){

            // startar "timern"
            System.out.println("Skriv 1 för att starta");
            scanner.next();
            LocalTime startTime = LocalTime.now();

            // stoppar "timern"
            System.out.println("Skriv 2 för att stanna");
            scanner.next();
            LocalTime stopTime = LocalTime.now();

            // tiden från start till stop
            Duration difference = Duration.between(startTime, stopTime);
            double skillnad = r - difference.getSeconds();

            // gör om "skillnad" till ett positivt tal
            if (skillnad < 0){
                skillnad = skillnad - (skillnad * 2);
            }

            System.out.println("Du stannade efter " + difference.getSeconds() + " sekunder");
            System.out.println("Du var " + skillnad + " sekunder ifrån " + r + " sekunder");

            // sparar det bästa resultatet
            if (bestResult > skillnad){
                long l = (new Double(skillnad)).longValue();
                bestResult = l;
            }
            System.out.println("Ditt bästa resultat än så länge: " + bestResult + " sekunder");

            // avslutar eller fortsätter while-loopen
            System.out.println("Skriv -1 om du vill avsluta programmet, skriv 1 för att köra om");
            int stop = scanner.nextInt();

            if (stop == -1){
                i++;
            }

        }

    }
}
