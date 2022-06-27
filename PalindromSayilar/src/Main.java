import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int num) {
        int basSayisi= 0,temp=num,reversenum=0;
        while (temp != 0) {
            temp/=10;
            basSayisi++;
        }
        temp = num;
        int lastnumber;
        while(temp != 0) {
            lastnumber = temp%10;
            temp = temp / 10;
            reversenum = (int) (reversenum + lastnumber*Math.pow(10,basSayisi-1));
            basSayisi--;
        }
        return reversenum == num;
    }
    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        k = sc.nextInt();
        System.out.println(isPalindrom(k) ? "Girilen sayı palindrom bir sayıdır." : "Girilen sayı palindrom bir sayı değildir.");
    }

}
