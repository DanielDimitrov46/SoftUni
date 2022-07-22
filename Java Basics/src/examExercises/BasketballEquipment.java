package examExercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taxForAllYear = Integer.parseInt(scanner.nextLine());
        double boots = taxForAllYear * 0.60;
        double teamClothes = boots * 0.80;
        double basketBall = 0.25 * teamClothes;
        double accessories = 0.20 * basketBall;
        double total = boots+teamClothes+basketBall+accessories+taxForAllYear;
        System.out.printf("%.2f",total);
    }
}
