package examExercises;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voucherPrice = Integer.parseInt(scanner.nextLine());
        String product = scanner.nextLine();
        int filmCounter = 0;
        int productCounter = 0;
        while (!product.equals("End")) {
            int total = 0;
            int symbols = product.length();
            if (symbols > 8) {
                total += product.charAt(0);
                total += product.charAt(1);
            } else if (symbols <= 8) {
                total += product.charAt(0);
            }
            if (total>voucherPrice) {
                break;
            }else{
                if(symbols>8){
                filmCounter++;
                }else{
                    productCounter++;
                }
            }
            voucherPrice -= total;
            product = scanner.nextLine();
        }
        System.out.printf("%d%n",filmCounter);
        System.out.printf("%d",productCounter);
    }
}
