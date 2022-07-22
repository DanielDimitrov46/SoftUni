package WhileLoop.Exercise;

import java.util.Scanner;

public class P07BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";
        boolean hatTrick = false;
        while (!playerName.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = playerName;
                if(goals>=3){
                hatTrick = true;
                }
            }
            if (goals >= 10) {
                break;
            }
            playerName = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n",bestPlayer);
        if(hatTrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n",maxGoals);
        }else{
            System.out.printf("He has scored %d goals.",maxGoals);
        }
    }
}
