import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Elmasın uzunluğunu giriniz (Tek sayı giriniz!): ");
        n = input.nextInt();
        n = n/2+1;
        for (int i = 1; i<=n; i++) {
            for (int k = 1; k<= (n-i);k++) {
                System.out.print(" ");
            }
            for(int l = 1; l<=2*i-1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int k = 1; k<= (n-i); k ++) {
                System.out.print(" ");
            }
            for(int l = 1; l<=2*i-1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
