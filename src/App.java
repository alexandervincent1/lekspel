import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Meny");
        System.out.println("1. Uppercut " + "2.Hook" + " 3.Bangkok");
        int menyval = tangentbord.nextInt();
        Random tärning = new Random();
        int slumptal = tärning.nextInt(100);
        int uppercut = slumptal;
        int hook = slumptal;
        int bangkok = slumptal;
        int spelarensliv = 100;
        int datornsliv = 100;
        Random tärning1 = new Random();
        int slumptal1 = tärning1.nextInt(100);
        

        while (menyval > 0) {
            switch (menyval) {
                case 1:
                    datornsliv = datornsliv - uppercut;
                    spelarensliv = spelarensliv - slumptal1;
                    System.out.println("Uppercut gjorde " + uppercut + " skada");
                    System.out.println("Datorn gjorde " + slumptal1 + " skada");
                    System.out.println("Du har " + spelarensliv + " liv kvar");
                    System.out.println("Datorn har " + datornsliv + " liv kvar");
                    System.out.println("1. Uppercut " + "2.Hook" + " 3.Bangkok");
                    menyval = tangentbord.nextInt();
                    break;

                case 2:
                    datornsliv = datornsliv - hook;
                    spelarensliv = spelarensliv - slumptal1;
                    System.out.println("Hook gjorde " + hook + " skada");
                    System.out.println("Datorn gjorde " + slumptal1 + " skada");
                    System.out.println("Du har " + spelarensliv + " liv kvar");
                    System.out.println("Datorn har " + datornsliv + " liv kvar");
                    System.out.println("1. Uppercut " + "2.Hook" + " 3.Bangkok");
                    menyval = tangentbord.nextInt();
                    break;
                case 3:
                    datornsliv = datornsliv - bangkok;
                    spelarensliv = spelarensliv - slumptal1;
                    System.out.println("Bangkok gjorde " + bangkok + " skada");
                    System.out.println("Datorn gjorde " + slumptal1 + " skada");
                    System.out.println("Du har " + spelarensliv + " liv kvar");
                    System.out.println("Datorn har " + datornsliv + " liv kvar");
                    System.out.println("1. Uppercut " + "2.Hook" + " 3.Bangkok");
                    menyval = tangentbord.nextInt();
                    break;

            }
        }

    
    }
    static int slut (datornsliv,spelarensliv){
        if (spelarensliv<=0) {
            System.out.println("Du förlorarade mot Hitler");
        }
        else if (datornslivliv<=0) {
            System.out.println("Du vann mot Datorn");
        }
    }
}

