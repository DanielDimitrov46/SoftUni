package examExercises;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        String bestMovie = "";
        int maxAsciiAmount = 0;
        int counter = 0;
        while (!movie.equals("STOP")) {
            counter++;
            int currentAscii = 0;

            for (int i = 0; i < movie.length(); i++) {
                char symbol = movie.charAt(i);
                currentAscii += symbol;
                if (symbol >= 97 && symbol <= 122) {
                    currentAscii -= 2 * movie.length();
                } else if (symbol >= 65 && symbol <= 90) {
                    currentAscii -= movie.length();
                }
                if (currentAscii > maxAsciiAmount) {
                    maxAsciiAmount = currentAscii;
                    bestMovie = movie;
                }
            }
            if (counter == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            movie = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxAsciiAmount);
    }
}
