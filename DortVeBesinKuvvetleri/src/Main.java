import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();
        System.out.print("4'ün katları: ");
        for(int i = 1; i<sayi; i*=4) {
            System.out.print(i + " " );
        }
        System.out.println();
        System.out.print("5'in katları: ");
        for(int i = 1; i<sayi; i*=5) {
            System.out.print(i + " ");
        }
    }
}
