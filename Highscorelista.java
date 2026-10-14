import java.util.Arrays;

public class Highscorelista {

public static void main(String[] args) {


int[] Highscores = {100, 200, 300, 400, 500};


Arrays.sort(Highscores);

System.out.println("Sorted highscores: " + Arrays.toString(Highscores));

System.out.println("The highest score is: " + Highscores[4]);
}
}