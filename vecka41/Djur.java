package vecka41;

public class Djur {
    String namn;
    int alder;
    String ljud;
    
    public Djur(String namn, int alder, String ljud) {
        this.namn = namn;
        this.alder = alder;
        this.ljud = ljud;
    }
    void gorLjud() {
    System.out.println(namn + " (" + alder + " år) säger: " + ljud + "!");
    }

    public static void main(String[] args) {
        Djur katt = new Djur("Pelle", 2, "mjauu");
        katt.gorLjud();

        Djur hund = new Djur("Bob", 5, "voff");
        hund.gorLjud();


        
    }
}
