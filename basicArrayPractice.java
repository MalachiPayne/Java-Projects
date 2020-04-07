import java.util.Arrays;
import java.util.Scanner;

public class basicArrayPractice {
    public static void main(String[] args) {

        // EXAMPLE ONE
        int[][] grades = { { 10, 9, 8, 7 }, { 6, 5, 4, 3, 2, 1, 0 } };
        // int grades[] = new int[10]; this type is commonly found in C and is still a
        // valid choice.
        System.out.println("\n" + "EXAMPLE ONE:" + "\n" + grades.length + "\n");

        // EXAMPLE TWO
        int[] grade = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        grade[1] = 900;
        System.out.println("EXAMPLE TWO:" + "\n" + "Updated Grade: " + grade[1] + "\n");

        // DO NOT REACH OUT OF THE ARRAY RANGE ie: [12] if there are only 10 elements

        // How to print the contents of an entire array:
        System.out.println("Printing arrays w/ Arrays.toString(a): " + "\n" + Arrays.toString(grade) + "\n");

        // OR you can use Arrays.deepToString(a) for printing arrays inside of arrays:
        System.out.println("Printing arrays w/ Arrays.deepToString(a): " + "\n" + Arrays.deepToString(grades) + "\n");

        // EXAMPLE THREE (USING FOR LOOPS)
        System.out.println("EXAMPLE THREE:");
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        int size = scnr.nextInt();
        int[] exThree = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Array Value: ");
            int x = scnr.nextInt();
            exThree[i] = x;
            // System.out.print(exThree[i]);
        }
        System.out.println("\n" + "Your Custom Array: " + Arrays.toString(exThree) + "\n");
        scnr.close();

        // EXAMPLE FOUR (SEARCHING WITH A FOR LOOP)
        System.out.println("EXAMPLE FOUR:");
        int[] exFour = { 1, 2, 3, 72 };

        for (int f = 0; f < exFour.length; f++) {
            if (exFour[f] == 72) {
                System.out.println("Found @ index: " + f + "\n");
            }
        }

        // EXAMPLE FIVE (SORTING ARRAYS)
        System.out.println("EXAMPLE FIVE:");
        int[] exFive = { 1, 2, 4, 3, 5, 6 };
        System.out.println("Array Before Sorting: " + Arrays.toString(exFive) + "\n");
        Arrays.sort(exFive);
        System.out.println("Array After Sorting: " + Arrays.toString(exFive) + "\n");

    }
}