package AConditionalStatemantsAdvanced2.Exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String type = scanner.nextLine();
     int r = Integer.parseInt(scanner.nextLine());
     int c = Integer.parseInt(scanner.nextLine());
     double totalPlaces = c*r;
     if (type.equals("Premiere")){
totalPlaces*=12.00;
     }else if (type.equals("Normal")){
         totalPlaces*=7.50;
     }else {
         totalPlaces*=5.00;
     }
        System.out.printf("%.2f",totalPlaces);
    }
}
