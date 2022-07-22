package Exam2Last;

import java.util.Scanner;

public class P04CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCats = Integer.parseInt(scanner.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
int totalFood = 0;

        for (int i = 1; i <= numberOfCats; i++) {
            double gramsOfFood = Double.parseDouble(scanner.nextLine());
            totalFood+=gramsOfFood;
            if (gramsOfFood >= 100 && gramsOfFood < 200) {
                group1++;
            } else if (gramsOfFood >= 200 && gramsOfFood < 300) {
                group2++;
            } else if (gramsOfFood >= 300 && gramsOfFood < 400) {
                group3++;
            }
        }
        double totalFoodPrice = (totalFood/1000.0)*12.45;
        System.out.printf("Group 1: %d cats.%n",group1);
        System.out.printf("Group 2: %d cats.%n",group2);
        System.out.printf("Group 3: %d cats.%n",group3);
        System.out.printf("Price for food per day: %.2f lv.",totalFoodPrice);
    }
}
