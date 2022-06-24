import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3;
        double u,alan;
        Scanner sc = new Scanner(System.in);
        System.out.print("İlk kenarı giriniz: ");
        kenar1 = sc.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        kenar2 = sc.nextInt();
        System.out.print("Üçüncü kenarı giriniz: ");
        kenar3 = sc.nextInt();
        u = (double)(kenar1 + kenar2 + kenar3)/2;
        alan = Math.sqrt((u)*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Alan: " + alan);
    }
}
