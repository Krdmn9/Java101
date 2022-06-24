import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price,distance,perkm=2.2,opening = 10;
        System.out.print("Yol uzunluğunu km cinsinden giriniz: ");
        distance = sc.nextDouble();
        price = (distance*perkm)+(opening);
        price = price >20 ? price : 20;
        System.out.print("Ödemeniz gerekn ücret" + price);
    }
}
