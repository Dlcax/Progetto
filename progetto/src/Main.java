import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException  {

        Scanner scan = new Scanner(System.in);
        SetupTXT file = new SetupTXT();
        Scrittura scrivi = new Scrittura();

        System.out.println("dimmi cosa fare");
        System.out.println("1 crea file");
        System.out.println("2 scrivi");

        int scelta =scan.nextInt();
        switch (scelta) {
            case 1:
                 file.CreazioneFile();
                break;
            case 2:
                scrivi.scrivi();
               break;
            default:
                break;
        }

    }
}