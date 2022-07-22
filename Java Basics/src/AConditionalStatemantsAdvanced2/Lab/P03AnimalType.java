package AConditionalStatemantsAdvanced2.Lab;

import java.util.Scanner;

public class P03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String type = "";
        switch (name) {
            case "dog":
                type = "mammal";
                break;
            case "snake":
            case "crocodile":
            case "tortoise":
                type = "reptile";
                break;
            default:
                type = "unknown";
                break;
        }
        System.out.println(type);
    }
}
