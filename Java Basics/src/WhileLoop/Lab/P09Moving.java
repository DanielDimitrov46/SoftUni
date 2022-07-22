package WhileLoop.Lab;

import java.util.Scanner;

public class P09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalBoxes = 0;
        int volumeHouse = width * length * height;

        while (!input.equals("Done") ) {
            int boxes = Integer.parseInt(input);
            totalBoxes += boxes;
            if(volumeHouse<=totalBoxes){
                System.out.printf("No more free space! You need %d Cubic meters more.",totalBoxes-volumeHouse);
                break;
            }
            input = scanner.nextLine();
        }
        if(input.equals("Done")){
            System.out.printf("%d Cubic meters left.",volumeHouse-totalBoxes);
        }
    }
}
