package WhileLoop.Exercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int totalPieces = width * length;
        String input = scanner.nextLine();
        int takenPieces = 0;
        boolean flagForTakenPieces = false;
        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            takenPieces += pieces;
            if (totalPieces <= takenPieces) {
                flagForTakenPieces = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (flagForTakenPieces) {
            System.out.printf("No more cake left! You need %d pieces more.", takenPieces - totalPieces);
        } else {
            System.out.printf("%d pieces are left.", totalPieces - takenPieces);
        }
    }
}
