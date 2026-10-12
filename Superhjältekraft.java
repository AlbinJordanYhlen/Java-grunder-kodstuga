public class Superhjältekraft {

    static int Powerlevel (int strength, int speed) {
        int totalPower = strength + speed;
        System.out.println("Total power level is: " + totalPower);
        return totalPower;
    }

static void main(String[] args) {
        int strength = 10;
        int speed = 5;
        Powerlevel(strength, speed);
}
}