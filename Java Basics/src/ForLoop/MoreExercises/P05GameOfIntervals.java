package ForLoop.MoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int addedPoints = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= 9) {
                addedPoints += 0.20 * number;
            } else if (number <= 19) {
                addedPoints += 0.30 * number;
            } else if (number <= 29) {
                addedPoints += 0.40 * number;
            } else if (number <= 39) {
                addedPoints += 50;
            } else if (number <= 50) {
                addedPoints += 100;
            } else {
                addedPoints /= 2;
            }
        }
    }
}
