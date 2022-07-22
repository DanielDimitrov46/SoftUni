package Exam2Last;

import java.util.Scanner;

public class P03CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfCats = scanner.nextLine();
        String sex = scanner.nextLine();
        int years = 0;
        switch (typeOfCats) {
            case "British Shorthair":
                if (sex.equals("m")) {
                    years = 13;
                } else {
                    years = 14;
                }
                break;
            case "Siamese":
                if (sex.equals("m")) {
                    years = 15;
                } else {
                    years = 16;
                }
                break;
            case "Persian":
                if (sex.equals("m")) {
                    years = 14;
                } else {
                    years = 15;
                }
                break;
            case "Ragdoll":
                if (sex.equals("m")) {
                    years = 16;
                } else {
                    years = 17;
                }
                break;
            case "American Shorthair":
                if (sex.equals("m")) {
                    years = 12;
                } else {
                    years = 13;
                }
                break;
            case "Siberian":
                if (sex.equals("m")) {
                    years = 11;
                } else {
                    years = 12;
                }
                break;
            default:
                System.out.printf("%s is invalid cat!", typeOfCats);
                break;
        }
        int toConvertToMonths = years*12;
        double totalCatsMonths = Math.floor(toConvertToMonths/6);
        if(years!=0){
        System.out.printf("%.0f cat months",totalCatsMonths);
        }
    }
}
