import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int amount,min=0,max=0,num;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        amount = input.nextInt();
        System.out.print("1. sayıyı giriniz: ");
        num = input.nextInt();
        min = num;
        max = num;
        for (int i = 2; i<= amount; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            num = input.nextInt();
            if (num < min) {
                min = num;
            }
            if (num>max) {
                max = num;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
