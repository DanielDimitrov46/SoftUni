package Exam;

import java.util.Scanner;

public class P05HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wantedSalary = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int total = 0;

        while (!input.equals("closed")) {
            int price = 0;
            if (input.equals("haircut")) {
                String type = scanner.nextLine();
                if (type.equals("mens")) {
                    price = 15;
                } else if (type.equals("ladies")) {
                    price = 20;
                } else {
                    price = 10;
                }
            } else {
                String type = scanner.nextLine();
                if (type.equals("touch up")) {
                    price = 20;
                } else {
                    price = 30;
                }
            }
            total += price;
            if(total>=wantedSalary){
                System.out.printf("You have reached your target for the day!%n");
                System.out.printf("Earned money: %dlv.",total);
                break;
            }
            input = scanner.nextLine();
        }
        if(input.equals("closed")){
            System.out.printf("Target not reached! ");
            System.out.printf("You need %dlv. more.%n",wantedSalary-total);
            System.out.printf("Earned money: %dlv.",total);
        }
    }
}
