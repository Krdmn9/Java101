import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        int right = 5;
        int[] answers = new int[right];
        int inputNumber;
        boolean isWin = false;
        System.out.println(randomNumber);
        while(right >= 1) {
            System.out.print("Tahmininizi giriniz: ");
            inputNumber = scan.nextInt();
            if (inputNumber < 0 || inputNumber > 100) {
                System.out.println("Lütfen 0-100 aralığında bir sayı giriniz.");
                answers[5-right] = inputNumber;
                right --;
                System.out.println("Kalan hakkınız: " + right);
            }
            else if (inputNumber < randomNumber) {
                System.out.println(inputNumber + " sayısı gizli sayıdan küçüktür.");
                answers[5-right] = inputNumber;
                right --;
                System.out.println("Kalan hakkınız: " + right);
            }
            else if (inputNumber > randomNumber) {
                System.out.println(inputNumber + " sayısı gizli sayıdan büyüktür.");
                answers[5-right] = inputNumber;
                right --;
                System.out.println("Kalan hakkınız: " + right);
            }
            else {
                System.out.println("Tebrikler! Doğru bildiniz.");
                answers[5-right] = inputNumber;
                right--;
                isWin = true;
                break;
            }

        }
        if (!isWin) {
            System.out.println("Hakkınız kalmadı. Kaybettiniz");
        }
        System.out.print("Tahminleriniz: ");
        for(int i = 0 ; i<(5-right); i++) {
            System.out.print(answers[i] + " ");
        }
    }
}
