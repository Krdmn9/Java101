import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi=0,toplam=0;
        while (sayi % 2 == 0) {
            if (sayi%4 == 0) {
                toplam += sayi;
            }
            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();
        }
        System.out.println("Toplam: " + toplam);
    }
}
