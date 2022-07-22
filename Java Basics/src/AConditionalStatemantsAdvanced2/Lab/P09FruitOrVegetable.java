package AConditionalStatemantsAdvanced2.Lab;

import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String type = "";
        switch (input){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
               type = "fruit";
               break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                type = "vegetable";
                break;
            default:
                type = "unknown";
                break;
        }
        System.out.println(type);
    }
}
