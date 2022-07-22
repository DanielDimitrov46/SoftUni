package examExercises;

import java.util.Scanner;

public class Oscarsweekincinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        String typeOfHall = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (movie) {
            case "A Star Is Born":
                if (typeOfHall.equals("normal")) {
                    price = 7.50;
                } else if (typeOfHall.equals("luxury")) {
                    price = 10.50;
                } else {
                    price = 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (typeOfHall.equals("normal")) {
                    price = 7.35;
                } else if (typeOfHall.equals("luxury")) {
                    price = 9.45;
                } else {
                    price = 12.75;
                }
                break;
            case "Green Book":
                if (typeOfHall.equals("normal")) {
                    price = 8.15;
                } else if (typeOfHall.equals("luxury")) {
                    price = 10.25;
                } else {
                    price = 13.25;
                }
                break;
            case "The Favourite":
                if (typeOfHall.equals("normal")) {
                    price = 8.75;
                } else if (typeOfHall.equals("luxury")) {
                    price = 11.55;
                } else {
                    price = 13.95;
                }
                break;

        }
        double total = price*tickets;
        System.out.printf("%s -> %.2f lv.",movie,total);
    }
}
