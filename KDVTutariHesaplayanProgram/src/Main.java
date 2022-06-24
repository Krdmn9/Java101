import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kdv;
        int tutar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz: ");
        tutar = sc.nextInt();
        kdv = tutar > 1000 ? 0.08f : 0.18f;
        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV'li Fiyat: " + (tutar + (tutar*kdv)));
        System.out.println("KDV tutarı: " + (kdv*tutar));
    }
}
