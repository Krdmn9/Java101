import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double ort,sayi,toplam=0,adet=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi = input.nextInt();
        for(int i = 0; i<sayi; i++) {
            if (i%3 == 0 && i%4 == 0) {
                toplam += i;
                adet ++;
            }
        }
        ort = toplam/adet;
        System.out.println(sayi + " sayısına kadar 3 ve 4'e tam bölünen sayıların ortalaması: " + ort);
    }
}
