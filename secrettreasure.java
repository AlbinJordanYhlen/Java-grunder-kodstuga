public class secrettreasure {

public static void Main(String[] args){

int [] goldamounts = {15, 42, 7, 89, 23};

int totalGold = countGold(goldamounts);

System.out.println("The total amount of gold is: " + totalGold);
}

public static int countGold(int[] goldArray) {
int amount = 0;

for (int gold : goldArray) {
amount += gold;

}
return amount;

}

}
