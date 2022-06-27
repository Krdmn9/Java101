import java.util.*;
public class Main {
    static boolean asalMi(int sayi,int bolen) {
        if (bolen == sayi)
            return true;
        if (sayi%bolen == 0)
            return false;
        else
            return asalMi(sayi,bolen+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        System.out.println(asalMi(sayi,2) ? sayi + " asal sayıdır." : sayi + " asal sayı değildir.");
    }
}
