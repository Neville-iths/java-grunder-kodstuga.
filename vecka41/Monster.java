package vecka41;
import java.util.Random;

public class Monster {
    String name;
    int health;

    public Monster(String name, int startHealth){
        this.name = name;
        this.health = startHealth;
    }

    void taSkada (int skada) {
        health-= skada;
    }

    public static void main(String[] args) {
        Monster monster1 = new Monster("Shadow", 100);
        System.out.println("Monster: " + monster1.name + "\nHealth: " + monster1.health + "\n");
        try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        Random random = new Random();
        

        while(monster1.health > 0) {
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            
            int skada = (random.nextInt(3) + 1) * 5;
            monster1.taSkada(skada);
            System.out.println("Monster: " + monster1.name + "\nHealth: " + monster1.health + "\nDamage: " + "-" + skada + "\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
            

        }
        
    }

    
}
