package examExercises;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFilms = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.NEGATIVE_INFINITY;
        double minRating = Double.POSITIVE_INFINITY;
        String bestFilm = "";
        String worstFilm = "";
        double averageRating = 0;
        for (int i = 1; i <= numberOfFilms; i++) {
            String nameOfFilm = scanner.nextLine();
            double ratingOfFilm = Double.parseDouble(scanner.nextLine());
            averageRating+=ratingOfFilm;
            if (ratingOfFilm > maxRating) {
                maxRating = ratingOfFilm;
                bestFilm = nameOfFilm;
            }
            if (ratingOfFilm < minRating) {
                minRating = ratingOfFilm;
                worstFilm = nameOfFilm;
            }

        }
        System.out.printf("%s is with highest rating: %.1f%n",bestFilm,maxRating);
        System.out.printf("%s is with lowest rating: %.1f\n",worstFilm,minRating);
        System.out.printf("Average rating: %.1f",averageRating/numberOfFilms);
    }
}
