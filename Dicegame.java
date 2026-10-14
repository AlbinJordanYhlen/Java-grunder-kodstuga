import java.util.Arrays;


public class Dicegame {

public static void main(String[] args) {

    int[] thrown = {2, 5, 1, 6, 4};


    System.out.print ("Dice thrown: ");
 int totalScore = 0;
        for (int i = 0; i < thrown.length; i++) {
            System.out.print(thrown[i] + " ");
            totalScore += thrown[i];

}
System.out.println ("Score: " + totalScore);
Arrays.sort(thrown);
System.out.println("Sorted throws: " + Arrays.toString(thrown));

int lowest = thrown[0];
int highest = thrown[thrown.length -1];
System.out.println("Lowest throw: " + lowest);
System.out.println("Highest throw: " + highest);

int searchvalue = 6;
int index = Arrays.binarySearch(thrown, searchvalue);

if (index >= 0) {
    System.out.println("Value " + searchvalue + " was found  in index " + index + " of the sorted array.");
 } else {
    System.out.println("Value " + searchvalue + " was not found in the sorted array."); 

}

}



}

