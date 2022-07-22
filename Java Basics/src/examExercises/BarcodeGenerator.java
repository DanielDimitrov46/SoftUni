package examExercises;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first4digitCode = Integer.parseInt(scanner.nextLine());
        int last4digitCode = Integer.parseInt(scanner.nextLine());
        int a = (first4digitCode / 1000);
        int b = ((first4digitCode / 100) % 10);
        int c = ((first4digitCode / 10) % 10);
        int d = ((first4digitCode / 1) % 10);

        int n = (last4digitCode / 1000);
        int m = ((last4digitCode / 100) % 10);
        int x = ((last4digitCode / 10) % 10);
        int y = ((last4digitCode / 1) % 10);
        for (int i = a; i <= n; i++) {
            if(i%2!=0){
                for (int j = b; j <= m; j++) {
                    if(j%2!=0){
                        for (int k = c; k <= x; k++) {
                            if(k%2!=0){
                                for (int l = d; l <= y; l++) {
                                    if(l%2!=0){
                                        System.out.printf("%d%d%d%d ",i,j,k,l);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
