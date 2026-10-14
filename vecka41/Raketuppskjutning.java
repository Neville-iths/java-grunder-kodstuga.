package vecka41;

public class Raketuppskjutning {
    public static void main(String[] args) {
        
        int i;
        for(i=10;i>=1; i--) {
            if(i==5) {
                continue;
            }
            System.out.println(i); 
        }
        System.out.println("LIFTOFF!");
    }
}
