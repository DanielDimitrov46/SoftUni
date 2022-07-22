package WhileLoop.Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
String bookNow = scanner.nextLine();
int bookCounter = 0;
        while (!bookNow.equals("No More Books")){
            if(searchedBook.equals(bookNow)){
                System.out.printf("You checked %d books and found it.",bookCounter);
                break;
            }
            bookCounter++;
            bookNow = scanner.nextLine();
        }
        if(bookNow.equals("No More Books")){
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.",bookCounter);
        }
    }
}
