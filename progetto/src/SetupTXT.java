import java.io.File;
import java.util.Scanner;

public class SetupTXT {
    Scanner scan = new Scanner(System.in);

    //creando il file
    public void CreazioneFile(){
        try {
            File file= new File("password.txt");
            System.out.println("Creazione del file");
           //controllo se il file esiste
            if (file.exists()) {
                System.out.println("il file "+file.getName()+" Esiste");
            }
            else {
                file.createNewFile();
                System.out.println("il file è stato creato "+" "+ file.getName());
                System.out.println("si trova "+ file.getAbsolutePath());
            }
            }
             catch (Exception e) {
                System.out.println("Il file non è stato creato");
            }
    }
}
