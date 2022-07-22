package Exam2Last;

import java.util.Scanner;

public class P05PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilogramsOfBoughtFood = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int convertedKilograms = kilogramsOfBoughtFood * 1000;
        int eatenFood = 0;

        while (!input.equals("Adopted")) {
            int gramsOfFood = Integer.parseInt(input);
            eatenFood += gramsOfFood;

            input = scanner.nextLine();
        }
        if(eatenFood<=convertedKilograms){
            System.out.printf("Food is enough! Leftovers: %d grams.",convertedKilograms-eatenFood);
        }else{
            System.out.printf("Food is not enough. You need %d grams more.",eatenFood-convertedKilograms);
        }

    }
}
