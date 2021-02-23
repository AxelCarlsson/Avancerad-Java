import java.time.Duration;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = (int) (Math.random() * (15 - 5)) + 5;

        System.out.println("Försök stanna programmet efter "+ r +" sekunder");
        long bestResult = 1000;

        int i = 0;
        while (i == 0){

            System.out.println("Skriv 1 för att starta");
            scanner.next();
            LocalTime startTime = LocalTime.now();

            System.out.println("Skriv 2 för att stanna");
            scanner.next();
            LocalTime stopTime = LocalTime.now();


            Duration difference = Duration.between(startTime, stopTime);
            double skillnad = r - difference.getSeconds();

            if (skillnad < 0){
                skillnad = skillnad - (skillnad * 2);
            }

            System.out.println("Du stannade efter " + difference.getSeconds() + " sekunder");
            System.out.println("Du var " + skillnad + " sekunder ifrån " + r + " sekunder");


            if (bestResult > skillnad){
                long l = (new Double(skillnad)).longValue();
                bestResult = l;
            }
            System.out.println("Ditt bästa resultat än så länge: " + bestResult + " sekunder");

            System.out.println("Skriv -1 om du vill avsluta programmet");
            int stop = scanner.nextInt();

            if (stop == -1){
                i++;
            }

        }

    }
}
