package CompB11Practice.src;

public class nestedLoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int space = 1; space <= 10 - i; ++space) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("◦ ");
            }

            for (int j = 0; j < i - 1; ++j) {
                System.out.print("◦ ");
            }

            System.out.println();
        }
    }
}