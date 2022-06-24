import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean artikyilMi;
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        yil = input.nextInt();
        if (yil%4 == 0) {
            if (yil % 100 == 0) {
                artikyilMi = yil % 400 == 0;
            }
            else {
                artikyilMi = true;
            }
        }
        else {
            artikyilMi = false;
        }
    if (artikyilMi) {
        System.out.println(yil + " bir artık yıldır.");
    }
    else {System.out.println(yil + " bir artık yıl değildir.");}
    }
}
