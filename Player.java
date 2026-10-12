public class Player {

private int score;
public int getScore() {
    return this.score;

}
public void SetScore(int score) {
    this.score = score;
}

public  static void main(String[] args) {
    Player player = new Player();
    player.SetScore(100);
    System.out.println("Player score: " + player.getScore());


}
}