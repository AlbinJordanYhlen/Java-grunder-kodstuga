public class Fight {

    public static String spelNamn = "dfsokmwdfokmdsfm";

private String name;
private int health; 


public Fight(String name, int health) {
this.name = name;
this.health = health;

}

public void StandardAttack() {
    System.out.println(this.name + " attacks with a standard attack!");

}
public void takedamage(int damage) {

    this.health -= damage;
    System.out.println(this.name + " takes " + damage + " damage! Remaining health: " + this.health);

}
public int getHealth() {
    return this.health;

}
public static void showgameInfo() {
    System.out.println("Game name: " + spelNamn);

}
public static void main(String[] args) {
  Fight.showgameInfo();

  Fight Arnold = new Fight("Arnold", 100);
    Arnold.StandardAttack();
    Arnold.takedamage(20);

    int remainingHealth = Arnold.getHealth();
    System.out.println(Arnold.name + "'s remaining health: " + remainingHealth);

}
}