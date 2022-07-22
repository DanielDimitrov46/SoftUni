package ExamPreparation;

import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String progressOfChampionship = scanner.nextLine();
        String typeOfTicket = scanner.nextLine();
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        String shotWithCup = scanner.nextLine();
        double price = 0;

        switch (progressOfChampionship) {
            case "Quarter final":
                if (typeOfTicket.equals("Standard")) {
                    price = 55.50;
                } else if (typeOfTicket.equals("Premium")) {
                    price = 105.20;
                } else {
                    price = 118.90;
                }
                break;
            case "Semi final":
                if (typeOfTicket.equals("Standard")) {
                    price = 75.88;
                } else if (typeOfTicket.equals("Premium")) {
                    price = 125.22;
                } else {
                    price = 300.40;
                }
                break;
            case "Final":
                if (typeOfTicket.equals("Standard")) {
                    price = 110.10;
                } else if (typeOfTicket.equals("Premium")) {
                    price = 160.66;
                } else {
                    price = 400;
                }
                break;
        }
        double priceForAllTickets = price * numberOfTickets;
        if (priceForAllTickets > 4000) {
            priceForAllTickets *= 0.75;
            if (shotWithCup.equals("Y")) {
                priceForAllTickets += (numberOfTickets * 0);
            }
        } else if (priceForAllTickets > 2500) {
            priceForAllTickets *= 0.90;
            if (shotWithCup.equals("Y")) {
                priceForAllTickets += (numberOfTickets * 40);
            }
        } else {
            if (shotWithCup.equals("Y")) {
                priceForAllTickets += (numberOfTickets * 40);
            }
        }
        System.out.printf("%.2f", priceForAllTickets);
    }
}
