import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Scrittura {

    long millis=System.currentTimeMillis();  
      
    // creating a new object of the class Date  
     Date date = new Date(millis); 

    public void scrivi () throws IOException{
        Scanner scan = new Scanner(System.in);
        LocalTime local = LocalTime.MIN;
        try {
            
            File file= new File("password.txt");
            if (file.exists()) {
            PrintWriter scrivi = new PrintWriter(new BufferedWriter(new FileWriter("password.txt",true)));
            System.out.println("Inserisci il sito WEB "+" ");
            scrivi.write(" Sito : "+scan.nextLine()+" ");
            scrivi.println();
            System.out.println("Inserisci la password da salvare");
            scrivi.write(" PW : "+scan.nextLine()+" ");
            scrivi.println();
            scrivi.write(" "+date+" ");
            System.out.println("dati inseriti");
            scrivi.println();
            scrivi.write(" ------------------------");
            scrivi.flush();
            scrivi.close();
            }
            else {
                System.out.println("crea il file prima");
            }
        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("non ci sono riuscito");
        }
    }
}
