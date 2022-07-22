    package ForLoop.Lab;

    import java.util.Scanner;

    public class P10OddEvenSum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 1; i <= n; i++) {
                int input = Integer.parseInt(scanner.nextLine());
                if (i % 2 == 0) {
                    evenSum += input;
                } else {
                    oddSum += input;
                }
            }
            if(oddSum==evenSum){
                System.out.printf("Yes%n");
                System.out.printf("Sum = %d",evenSum);
            }else {
                System.out.printf("No%n");
                System.out.printf("Diff = %d",Math.abs(evenSum-oddSum));
            }

        }
    }
