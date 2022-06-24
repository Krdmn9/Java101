import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km,age,type;
        float perkm = 0.1f,price;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = sc.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Çift Yön): ");
        type = sc.nextInt();
        if (km<=0 || age <=0 || (type != 1 && type!= 2)) {
            System.out.println("Hatalı veri girdiniz !");
        }
        else {
            price = perkm*km;
            price = (age<12) ? price*0.5f : price;
            price = (age>12 && age<24) ? price*0.9f : price;
            price = (age>65) ? price*0.7f : price;
            price = (type == 2) ? price*0.8f*2 : price;
            System.out.print("Toplam tutar : " +price + " TL");
        }

    }
}
