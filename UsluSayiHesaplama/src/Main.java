import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,result=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("Üssü giriniz: ");
        b = input.nextInt();
        for(int i = 0; i<b; i++) {
            result *= a;
        }
        System.out.println("Sonuç: " + result);
    }
}
