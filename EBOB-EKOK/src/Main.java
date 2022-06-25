import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m,temp;   // 24   18
        int ebob=0,ekok;
        int bolen = 1;
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();
        System.out.print("Bir sayı giriniz: ");
        m = input.nextInt();
        if (n<m) {
            temp = m;
            m = n;
            n = temp;
        }
        bolen = m;
        while(bolen > 1) {
            if (m%bolen == 0 && n%bolen == 0) {
                ebob = bolen;
                break;
            }
            bolen--;
        }
        ekok = (n*m)/ebob;
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
