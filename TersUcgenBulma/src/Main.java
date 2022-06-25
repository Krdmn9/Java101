import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int basamakSayisi;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        basamakSayisi = input.nextInt();
        for(int i = 0; i<basamakSayisi; i++) {
            for (int k = 0; k<i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l<(basamakSayisi-i)*2; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
