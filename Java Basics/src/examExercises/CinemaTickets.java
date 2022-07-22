package examExercises;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int allSoldTickets = 0;
        double kidTickets = 0;
        double standardTickets = 0;
        double studentTickets = 0;
        while (!input.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticket = scanner.nextLine();
            double soldTicketsForFilm = 0;
            int takenSeats = 0;
            while (!ticket.equals("End")) {
                switch (ticket) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                soldTicketsForFilm++;
                allSoldTickets++;
                takenSeats++;
                if (freeSeats == takenSeats) {
                    break;
                }
                ticket = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", input, soldTicketsForFilm / freeSeats * 100);
            input = scanner.nextLine();
        }
        if (input.equals("Finish")) {
            System.out.printf("Total tickets: %d%n", allSoldTickets);
            System.out.printf("%.2f%% student tickets.%n", studentTickets / allSoldTickets * 100);
            System.out.printf("%.2f%% standard tickets.%n", standardTickets / allSoldTickets * 100);
            System.out.printf("%.2f%% kids tickets.", kidTickets / allSoldTickets * 100);
        }
    }
}
