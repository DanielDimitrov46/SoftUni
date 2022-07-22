package ForLoop.Exercise;

import java.util.Scanner;

public class P07FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        double wCounter = 0;
        double dCounter = 0;
        double lCounter = 0;
int points = 0;

        for (int i = 0; i < n; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    wCounter++;
                    points+=3;
                    break;
                case "D":
                    dCounter++;
                    points+=1;
                    break;
                case "L":
                    lCounter++;
                    break;
            }
        }
        if(n<=0){
            System.out.printf("%s hasn't played any games during this season.",name);
        }else {
            double percent = wCounter/n*100;
            System.out.printf("%s has won %d points during this season.%n",name,points);
            System.out.println("Total stats:");
            System.out.printf("## W: %.0f%n",wCounter);
            System.out.printf("## D: %.0f%n",dCounter);
            System.out.printf("## L: %.0f%n",lCounter);
            System.out.printf("Win rate: %.2f%%",percent);
        }

    }
}
