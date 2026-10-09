public class Monster {

int health;
String name = "Eldritch horror";

public Monster() {
  health = 100;
 name = "Eldritch horror"; }
public static void main(String[] args) {
    Monster monster = new Monster();
    System.out.println("Namn: " + monster.name);
    System.out.println("Hälsa: " + monster.health);
    while (monster.health > 0) {
        monster.health -= 10;
        if (monster.health <= 0) {
            System.out.println("AAAHHHHHH! " + monster.health);
        } else {
            System.out.println("It huuuurts: " + monster.health);
        }
       
    }


}


}
