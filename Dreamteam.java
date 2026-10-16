public class Dreamteam {

public static void main(String[] args){

String[] players = {"Ian", "Elijah", "Billy", "Christopher", "Peter"};
System.out.println("Fist player " + players[0]);
System.out.println("Last player " + players[players.length - 1]);
System.out.println();

players[2] = "Boyd";

System.out.println("All players ");
for (int i = 0; i < players.length; i++) {
    System.out.println(players[i]);
}
System.out.println();

System.out.println("Amount of players in team: " + players.length);
System.out.println();

}


}
