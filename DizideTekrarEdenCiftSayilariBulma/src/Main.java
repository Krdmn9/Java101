import java.util.*;

public class Main {
    public static boolean isFound(int[] arr,int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {6, 7, 6, 5, 4, 10, 4, 3, 2, 9, 10, 21,4 , 1, 33, 9, 1};
        int[] tekrarEdenCiftSayilar = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if ((list[i] == list[j]) && (i != j) && (list[i] % 2 == 0) && !isFound(tekrarEdenCiftSayilar,list[i])) {
                    tekrarEdenCiftSayilar[index] = list[i];
                    index++;
                    break;
                }
            }
        }
        for (int i : tekrarEdenCiftSayilar) {
            if (i != 0)
                System.out.print(i + " ");
        }
    }
}
