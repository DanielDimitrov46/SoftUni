package WhileLoop.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int spendCounter = 0;
        int allDays = 0;
        while (availableMoney < neededMoney) {
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            allDays++;
            switch (action) {
                case "spend":
                    spendCounter++;
                    availableMoney -= sum;
                    if (spendCounter == 5) {

                    }
                    break;
                case "save":
                    availableMoney += sum;
                    spendCounter = 0;
                    break;
            }
            if (spendCounter == 5) {
                break;
            }
            if(availableMoney<0){
            availableMoney = 0;
            }
        }
        if (availableMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", allDays);
        } else {
            System.out.printf("You can't save the money.%n");
            System.out.printf("%d", allDays);
        }
    }
}
