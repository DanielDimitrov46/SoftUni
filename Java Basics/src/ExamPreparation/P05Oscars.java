package ExamPreparation;

import java.util.Scanner;

public class P05Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalPoints = pointsFromAcademy;
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            String nameOfJudge = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());
            int nameLength = nameOfJudge.length();
            double points = (nameLength * pointsFromJudge) / 2;
            totalPoints += points;
            if (totalPoints >= 1250.5) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actor,totalPoints);
        }else{
            System.out.printf("Sorry, %s you need %.1f more!",actor,1250.5-totalPoints);
        }
    }
}
