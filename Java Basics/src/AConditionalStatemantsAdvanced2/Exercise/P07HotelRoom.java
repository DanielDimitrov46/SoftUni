package AConditionalStatemantsAdvanced2.Exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = 0;
        double studio = 0;
        double apartment = 0;
        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                if (nights>14) {
                    studio = studio*0.70;
                    apartment = apartment*0.90;
                }else if (nights>7){
                    studio = studio * 0.95;

                }
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                if (nights>14) {
                    studio = studio*0.80;
                    apartment = apartment*0.90;
                }else if (nights>7){
                    studio = 75.20;
                    apartment = 68.70;
                }
                break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                if (nights>14) {

                    apartment = apartment*0.90;
                }else if (nights>7){
                    studio = 76;
                    apartment = 77;
                }
                break;

        }
        double total1 =studio*nights;
        double total2 =apartment*nights;
        System.out.printf("Apartment: %.2f lv.%n",total2);
        System.out.printf("Studio: %.2f lv.",total1);
    }
}
