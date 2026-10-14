package vecka41;
import java.util.Scanner;
public class fredagsMenyn {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Fredagsmeny\nVälj mellan 1-4.");
        int choice = sc.nextInt();
        sc.close();

        switch (choice) {
            case 1:
                System.out.println("Lax med potatis");  
                break;
            case 2: 
                System.out.println("Ris och kyckling");
                break;
            case 3:
                System.out.println("Lasagne");
                break;
            case 4:
                System.out.println("Korv med mos");
                break;
        
            default:
                System.out.println("Ogiltigt val. Välj 1-4.");
                break;
        }
    }
}
