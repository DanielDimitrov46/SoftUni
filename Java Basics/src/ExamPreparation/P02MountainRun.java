package ExamPreparation;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeFor1M = Double.parseDouble(scanner.nextLine());

        double timeForClimb = distanceInMeters*timeFor1M;
        double addedTime = Math.floor(distanceInMeters/50)*30;
        double totalTime = timeForClimb+addedTime;

        if(totalTime>=record){
            System.out.printf("No! He was %.2f seconds slower.%n",totalTime-record);
        }else{
            System.out.printf("Yes! The new record is %.2f seconds.",totalTime);
        }
    }
}
