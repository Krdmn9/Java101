import java.util.*;
public class Main {
    public static double harmonikOrt(int[] arr) {
        double sum=0;
        for(int i: arr) {
            sum += 1.0/i;
        }
        return (double) arr.length/sum;

    }

    public static int[] createArr(int size) {
        int[] list = new int[size];
        Random rand = new Random();
        for(int i= 0; i < size; i++) {
            list[i] = rand.nextInt(10);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.print("Dizi boyutunu giriniz: ");
        size = scan.nextInt();
        int[] list = createArr(size);
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Harmonik ortalama: " + harmonikOrt(list));
    }
}
