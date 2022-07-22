package ConditionalStatemants.Exercise;

import java.util.Scanner;

public class P03SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        String speedInfo = "";
        if (speed<=10){
speedInfo = "slow";
        }else if (speed<=50){
speedInfo = "average";
        }else if (speed<=150){
            speedInfo = "fast";
        }else if (speed<=1000){
            speedInfo = "ultra fast";
        }else{
            speedInfo = "extremely fast";
        }
        System.out.println(speedInfo);
    }
}
