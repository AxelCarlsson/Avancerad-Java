import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How long is your videotape? (in minutes)");
        int tapeLength = scanner.nextInt();
        System.out.println("How much have you used of your tape? (in minutes)");
        int usedTape = scanner.nextInt();

        int minutes = tapeLength - usedTape;

        double hoursDouble = 0;
        if (minutes > 60){
            hoursDouble = minutes / 60;
            minutes = minutes % 60;
        }
        int hoursInt = (int) hoursDouble;

        System.out.println("When does your show start? (hh:mm)");
        String showStart = scanner.next();
        String[] arrShowStart = showStart.split(":");

        System.out.println("When does your show end? (hh:mm)");
        String showEnd = scanner.next();
        String[] arrShowEnd = showEnd.split(":");

        int showEndHours = Integer.parseInt(arrShowEnd[0]);
        int showStartHours = Integer.parseInt(arrShowStart[0]);
        int showEndMin = Integer.parseInt(arrShowEnd[1]);
        int showStartMin = Integer.parseInt(arrShowStart[1]);

        showEndHours = showEndHours - showStartHours;
        showEndMin = showEndMin - showStartMin;

        LocalTime tapeSize = LocalTime.of(hoursInt, minutes, 0, 0);
        LocalTime start = LocalTime.of(0, 0, 0, 0);
        LocalTime end = LocalTime.of(showEndHours, showEndMin, 0, 0);

        Duration showDuration = Duration.between(start, end);
        Duration tapeDuration = Duration.between(start, tapeSize);

        System.out.println(tapeDuration.getSeconds());
        System.out.println(showDuration.getSeconds());

        if(tapeDuration.getSeconds() >= showDuration.getSeconds()){
            System.out.println("Ditt videoband har tillräckligt med plats för programmet :) ");
        } else {
            System.out.println("Ditt videoband har inte tillräckligt med plats för programmet :( ");
        }
    }
}
