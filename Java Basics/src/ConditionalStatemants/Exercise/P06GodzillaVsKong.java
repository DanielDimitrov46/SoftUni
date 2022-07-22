package ConditionalStatemants.Exercise;

import java.util.Scanner;

public class P06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetForFilm = Double.parseDouble(scanner.nextLine());
        int numberOfStatists = Integer.parseInt(scanner.nextLine());
        double priceForOneClothForOneStatist = Double.parseDouble(scanner.nextLine());
        double priceForDecor = budgetForFilm*0.10;

        double totalPriceForClothes = numberOfStatists*priceForOneClothForOneStatist;
        if (numberOfStatists>=150){
            totalPriceForClothes-=totalPriceForClothes*0.10;
        }
        double totalPriceForFlm = totalPriceForClothes+priceForDecor;
        if (totalPriceForFlm>budgetForFilm){
            double expenses = totalPriceForFlm-budgetForFilm;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",expenses);
        }else{
            double expenses = budgetForFilm-totalPriceForFlm;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",expenses);


        }
    }
}
