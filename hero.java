public class hero {

private int score; 

public hero(){
    this.score = 0;
}
public int getScore() {
return this.score;

}
public void setScore(int score){
this.score = score;


}

public static void Main(String[] args){

hero myHero = new hero();

int[] scoreValues = {10, 20, 5, 50, 15};
int totalAmount = 0;
for (int s : scoreValues) {
totalAmount += s;

}
myHero.setScore(totalAmount);
System.out.println("Heroes total score: " + myHero.getScore());

}

}
