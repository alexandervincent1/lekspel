import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        startspel();
        spelet();

    }

    public static void startspel() {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Tryck på enter för och starta spel");
        
        String startaspell = tangentbord.nextLine();
        

    }

    public static void spelet() {
        Scanner tangentbord = new Scanner(System.in);
        int spelarensliv = 100;
        int datornsliv = 100;
        int runda = 0;
        int vinstspelare=0;
        
        
        while (true) {
            int menyval = 0;
        Random tärning = new Random();
        int slumptal = tärning.nextInt(100);
        int uppercut = slumptal;
        int hook = slumptal;
        int bangkok = slumptal;
        Random tärning1 = new Random();
        int slumptal1 = tärning1.nextInt(100);
        
        System.out.println(" ");
            System.out.println("1. Uppercut " + "2.Hook" + " 3.Bangkok");
            menyval = tangentbord.nextInt();

            if (menyval == 1) {
                datornsliv = datornsliv - uppercut;
                spelarensliv = spelarensliv - slumptal1;
                System.out.println(" ");
                System.out.println("Uppercut gjorde " + uppercut + " skada");
                System.out.println("Datorn gjorde " + slumptal1 + " skada");
                System.out.println("Du har " + spelarensliv + " liv kvar");
                System.out.println("Datorn har " + datornsliv + " liv kvar");
              
            }
            if (menyval == 2) {
                datornsliv = datornsliv - hook;
                spelarensliv = spelarensliv - slumptal1;
                System.out.println(" ");
                System.out.println("Hook gjorde " + hook + " skada");
                System.out.println("Datorn gjorde " + slumptal1 + " skada");
                System.out.println("Du har " + spelarensliv + " liv kvar");
                System.out.println("Datorn har " + datornsliv + " liv kvar");
                         }
            if (menyval == 3) {
                datornsliv = datornsliv - bangkok;
                spelarensliv = spelarensliv - slumptal1;
                System.out.println(" ");
                System.out.println("Bangkok gjorde " + bangkok + " skada");
                System.out.println("Datorn gjorde " + slumptal1 + " skada");
                System.out.println("Du har " + spelarensliv + " liv kvar");
                System.out.println("Datorn har " + datornsliv + " liv kvar");
                

            }
            if (menyval==10) {
        
                
            }
            if (datornsliv <= 0) {
                menyval = 10;
                System.out.println(" ");
                System.out.println("Du vann");
                runda++;
                vinstspelare++;
                System.out.println(" ");
                System.out.println("Du har kört "+ runda+" och vunnit "+vinstspelare);
                datornsliv =100;
                spelarensliv = 100;
                startspel();
            }
            else if (spelarensliv<=0) {
                menyval=10;
                System.out.println("Du torska");
                runda++;
                System.out.println("Du har kört "+ runda+" och vunnit "+vinstspelare);
                spelarensliv = 100;
                datornsliv =100;
                startspel();
            }

        }
        

    }
}
