import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat,fiz,turk,kim,muz;
        double toplam = 0,ort;
        int dersSayisi=0;
        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        if (mat>=0 && mat<=100) {
            dersSayisi++;
            toplam += mat;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fiz = inp.nextInt();
        if (fiz>=0 && fiz<=100) {
            dersSayisi++;
            toplam += fiz;
        }
        System.out.print("Türkçe notunuzu giriniz: ");
        turk = inp.nextInt();
        if (turk>=0 && turk<=100) {
            dersSayisi++;
            toplam += turk;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kim = inp.nextInt();
        if (kim>=0 && kim<=100) {
            dersSayisi++;
            toplam += kim;
        }
        System.out.print("Müzik notunuzu giriniz: ");
        muz = inp.nextInt();
        if (muz>=0 && muz<=100) {
            dersSayisi++;
            toplam += muz;
        }
        ort = toplam/dersSayisi;
        System.out.println("Ortalamanız: " + ort);
        if (ort >= 55) {
            System.out.println("Geçtiniz!");
        }
        else {
            System.out.println("Kaldınız!");
        }


    }
}
