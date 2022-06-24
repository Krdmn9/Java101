import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy,kilo,vki;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();
        vki = kilo/(Math.pow(boy,2));
        System.out.println("Vücut kitle indeksiniz: " + vki);
    }
}
