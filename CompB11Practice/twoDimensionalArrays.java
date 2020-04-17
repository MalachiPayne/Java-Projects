package CompB11Practice;

public class twoDimensionalArrays {
    public static void main(String[] args) {

        int grades[][] = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 9, 10, 11 } };
        // System.out.println(grades.length);
        // System.out.println(grades[1].length);
        for (int row = 0; row < grades.length; row++) {
            for (int col = 0; col < grades[row].length; col++) {
                System.out.print(grades[row][col] + " ");
            }
            System.out.println("");
        }

    }
}
