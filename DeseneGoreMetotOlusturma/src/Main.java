import java.util.Scanner;
public class Main {
    static int desen(int n,int sayac,int temp) {
        if (n>0 && sayac != 1) {
            System.out.print(n + " ");
            return desen(n - 5, sayac,temp);
        }
        if (n == temp) {
            System.out.print(n);
            return 0;
        }
        sayac = 1;
        System.out.print(n + " ");
        return desen(n+5,sayac,temp);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = scan.nextInt();
        desen(n,0, n);
    }
}
