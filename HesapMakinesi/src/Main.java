import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float num1,num2;
        int procces;
        System.out.println("İlk sayıyı giriniz: ");
        num1 = inp.nextFloat();
        System.out.println("İkinci sayıyı giriniz: ");
        num2 = inp.nextFloat();
        System.out.println("İşlem seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        procces = inp.nextInt();
        switch (procces) {
            case 1:
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + "*" + num2 + "=" +  (num1 * num2));
                break;
            case 4:
                if(num2 == 0) {
                    System.out.println("Sayılar '0' ile bölünemez! ");
                }
                else {
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız!");
                break;
        }
    }
}
