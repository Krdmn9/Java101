import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scan.nextInt();
        int max=0,min=0;
        System.out.println("Dizi: " + Arrays.toString(arr));
        Arrays.sort(arr);
        for (int j : arr) {
            if (j > num) {
                max = j;
                break;
            }
            if (j < num) {
                min = j;
            }
        }
        System.out.println("Girilen sayı: " + num);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}
