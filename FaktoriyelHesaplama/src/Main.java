import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n,r,result,n_fac=1,nr_fac = 1,r_fac=1;
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();
        for(int i = 1; i<=n; i++) {
            n_fac *=i;
        }
        for(int i = 1; i<=(n-r); i++) {
            nr_fac *=i;
        }
        for(int i = 1; i<=r; i++) {
            r_fac *=i;
        }
        result = n_fac / (r_fac*nr_fac);
        System.out.println("Sonuç: " + result);
    }
}
