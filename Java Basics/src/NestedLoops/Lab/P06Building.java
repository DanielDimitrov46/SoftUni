package NestedLoops.Lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int f = floors; f >= 1; f--) {
            for (int r = 0; r < rooms; r++) {
                String letter = "";
                if (f == floors) {
                    letter = "L";
                } else if (f % 2 == 0) {
                    letter = "O";
                } else {
                    letter = "A";
                }
                System.out.printf("%s%d%d ", letter, f, r);
            }
            System.out.println();
        }
    }
}
