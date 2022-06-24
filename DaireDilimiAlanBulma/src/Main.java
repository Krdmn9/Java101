import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14,alan,r,a,cevre,dairedilimialani;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r = inp.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz: ");
        a = inp.nextInt();
        alan = pi*r*r;
        cevre = 2*pi*r;
        dairedilimialani = alan*(a/360);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
        System.out.println(a + " derecelik merkez açıyla oluşturulan dairenin alanı: " + dairedilimialani);

    }
}
