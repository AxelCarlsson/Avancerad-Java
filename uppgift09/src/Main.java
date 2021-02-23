import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int i = 0;
        while (i == 0){
            System.out.println("Skriv vilken stad du vill veta tiden för \n 1 för Toronto \n 2 för Stockholm \n 3 för Shanghai");
            int stad = scanner.nextInt();
            if (stad == 1){
                LocalTime toronto = LocalTime.now(TimeZone.getTimeZone("America/Toronto").toZoneId());
                System.out.println("Den lokala tiden i Toronto: " + toronto);
                i++;
            } else if(stad == 2){
                LocalTime stockholm = LocalTime.now(TimeZone.getTimeZone("Europe/Stockholm").toZoneId());
                System.out.println("Den lokala tiden i Stockholm: " + stockholm);
                i++;
            } else if (stad == 3){
                LocalTime shanghai = LocalTime.now(TimeZone.getTimeZone("Asia/Shanghai").toZoneId());
                System.out.println("Den lokala tiden i Shanghai: " + shanghai);
                i++;
            } else{
                System.out.println("Den staden finns inte i listan");
            }
        }








        /*
        LocalDateTime ldt = LocalDateTime.now();

        ZoneId ziKolkata = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zdtKolkata = ZonedDateTime.of(ldt, ziKolkata);
        System.out.println("In India Central Time Zone: " + zdtKolkata);
        */


       /* LocalDateTime ldt = LocalDateTime.now();

        ZoneId torontoId = ZoneId.of("America/Toronto");
        System.out.println("Timezone : " + torontoId);

        ZonedDateTime americaZoneDateTime = ldt.atZone(torontoId);
        System.out.println("Time : " + americaZoneDateTime.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        System.out.println();

        ZoneId stockholmId = ZoneId.of("Europe/Stockholm");
        System.out.println("Timezone : " + stockholmId);

        ZonedDateTime stockholmZoneDateTime = ldt.atZone(stockholmId);
        System.out.println("Time : " + stockholmZoneDateTime.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
           */


    }
}
