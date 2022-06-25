import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        num = input.nextInt();
        for(int i = 1; i<num; i++) {
            if (num%i == 0) {
                sum += i;
            }
        }
        System.out.println(num + " sayısı " + ((sum == num) ? "mükemmel sayıdır" : "mükemmel sayı değildir."));
    }
}
