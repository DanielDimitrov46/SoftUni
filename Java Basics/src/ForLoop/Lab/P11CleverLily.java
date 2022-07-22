package ForLoop.Lab;

import java.util.Scanner;

public class P11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());
        int countToys = 0;
        double currentMoney = 0;
        int brotherCount = 0;
        double sum = 0;
        double allSavedMoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                countToys++;
            } else {
                brotherCount++;
                currentMoney += 10;
                sum += currentMoney;
            }
        }
        allSavedMoney = (countToys * pricePerToy) + (sum - brotherCount);
        if(allSavedMoney>=priceWashingMachine){
            System.out.printf("Yes! %.2f",allSavedMoney-priceWashingMachine);
        }else {
            System.out.printf("No! %.2f",priceWashingMachine-allSavedMoney);
        }
    }
}
