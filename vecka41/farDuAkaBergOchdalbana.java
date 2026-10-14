package vecka41;
import java.util.Scanner;

public class farDuAkaBergOchdalbana {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ålder: ");
        int age = sc.nextInt();
        System.out.println("Hur lång är du? ange i meter: ");
        double heigt = sc.nextDouble();

        if(age < 12) {
            System.out.println("Du är för ung.");
        } 
        else if (heigt < 1.35) {
            System.out.println("Du är för kort.");
        }
        else {
            System.out.println("Du får åka!");
        } 
        sc.close();
    }
    
}
