package ExamPreparation;

import java.util.Scanner;

public class P01Oscarsceremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());

        double statues = rent * 0.70;
        double catering = statues * 0.85;
        double sound = catering * 0.50;

        double total = statues+catering+sound+rent;
        System.out.printf("%.2f",total);
    }
}
