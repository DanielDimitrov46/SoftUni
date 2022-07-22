package NestedLoops.Lab;

import java.util.Scanner;

public class P07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double countAllTickets = 0;
        double studentTickets = 0;
        double kidsTickets = 0;
        double standardTickets = 0;
        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int counterTickets = 0;
            String command = scanner.nextLine();
            while (!command.equals("End")) {
                String typeTicket = command;
                counterTickets++;
                countAllTickets++;
                switch (typeTicket) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidsTickets++;
                        break;
                }
                if (counterTickets == freeSeats) {
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, (counterTickets * 1.0 / freeSeats) * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %.0f%n", countAllTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets / countAllTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets / countAllTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidsTickets / countAllTickets * 100);


    }
}
