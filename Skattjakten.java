

public class Skattjakten {
    public static void main(String[] args) {

int[][] skattkarta = new int[3][3];

skattkarta[1][2] = 1;

for (int i = 0; i < skattkarta.length; i++) {
    for (int j = 0; j < skattkarta[i].length; j++) {
        System.out.print(skattkarta[i][j] + " ");
    }
    System.out.println();

}
}
}