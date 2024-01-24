import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Meny");
        System.out.println(  "1. Uppercut "+ "2.Hook" +" 3.Bangkok");
        int menyval = tangentbord.nextInt();
        Random tärning = new Random();
        int slumptal = tärning.nextInt(100);
        int uppercut = slumptal;
        int hook = slumptal;
        int bangkok = slumptal;
        int liv = 100;


        switch (menyval) {
            case 1:
            liv = liv - uppercut;
            System.out.println("Uppercut gjorde "+uppercut+" skada");
            System.out.println("Du har "+liv+" liv kvar");
            break;
            case 2:
            liv = liv - hook;
            System.out.println("Hook gjorde "+hook+" skada");
            System.out.println("Du har "+liv+" liv kvar");
            break;
            case 3:
            liv = liv - bangkok;
            System.out.println("Bangkok gjorde "+bangkok+" skada");
            System.out.println("Du har "+liv+" liv kvar");
            break;
        
        }
    }
}
