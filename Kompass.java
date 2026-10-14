public class Kompass {

enum Direction {
    NORTH, EAST, SOUTH, WEST}

public static void main(String[] args) {

Direction currentDirection = Direction.NORTH;

switch (currentDirection) {
    case NORTH:
        System.out.println("You are walking North and feel the warmth of the sun on your face.");
        break;
    case EAST:
        System.out.println("You are walking East and feel the cool breeze on your face.");
        break;
    case SOUTH:
        System.out.println("You are walking South and feel a freezing cold on your face.");
        break;
    case WEST:
        System.out.println("You are walking West and feel the wind blowing against your face.");
        break;


}

System.out.println("Available directions: ");
for (Direction direction : Direction.values()) {
    System.out.println(direction + "");

}

}
}