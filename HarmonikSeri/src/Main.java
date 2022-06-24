import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num,result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();
        for (int i = 1; i<=num; i++) {
            result = i + (1.0/i);
        }
        System.out.println("Sonuç: " + result);
    }
}
