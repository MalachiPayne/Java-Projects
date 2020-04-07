import java.util.Scanner;

public class testEnv {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int numElements;
        numElements = scnr.nextInt();
        int[] userList = new int[numElements];

        /* ========== Type your code here ========== */
        int tempVal;

        // Input values
        for (int i = 0; i < userList.length; ++i) {
            System.out.print("Input: ");
            userList[i] = scnr.nextInt();
        }

        // Reverse values
        for (int i = 0; i < (userList.length / 2); ++i) {
            tempVal = userList[i];
            userList[i] = userList[userList.length - 1 - i];
            userList[userList.length - 1 - i] = tempVal;
        }

        // Print values
        System.out.print("\nNew values: ");
        for (int i = 0; i < userList.length; ++i) {
            System.out.print(userList[i] + " ");
        }
    }
}