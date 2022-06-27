import java.util.*;
public class Main {
    static int pow(int base, int exp) {
        if (exp == 0)
            return 1;
        else
            return base*pow(base,exp-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exp = scan.nextInt();
        System.out.println("Sonuç: " + pow(base,exp));
    }
}
