package ConditionalStatemants.Exercise;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        if (input <= 100) {
            bonusPoints += 5;
        } else if (input <+ 1000) {
            bonusPoints += input * 0.20;
        } else{
            bonusPoints += input * 0.10;
        }
        if (input % 2 == 0) {
            bonusPoints += 1;
        }
        if (input % 10 == 5) {
            bonusPoints += 2;
        }
        double total = input+bonusPoints;
        System.out.println(bonusPoints);
        System.out.println(total);
    }
}
