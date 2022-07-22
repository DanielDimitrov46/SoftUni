package ConditionalStatemants.Exercise;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double totalDistance = Double.parseDouble(scanner.nextLine());
        double timeFor1m = Double.parseDouble(scanner.nextLine());
        double totalTime = totalDistance*timeFor1m;
        double addedTime = Math.floor(totalDistance/15)*12.5;
        double total = totalTime+addedTime;
        if (total>=worldRecord){
            System.out.printf("No, he failed! He was %.2f seconds slower.",total-worldRecord);
        }else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",total);
        }
    }
}
