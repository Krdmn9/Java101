import java.util.Arrays;

public class Main {
    public static boolean isContain(int[] arr, int value) {
        for(int num: arr) {
            if (num==value) {
                return true;
            }
        }
        return false;
    }
    public static int elemanSayar(int[] arr,int value) {
        int counter = 0;
        for(int i: arr) {
            if (i==value) {
                counter ++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int fr,index=0;
        int[] list = {10,20,20,10,2,24,10,20,5,20};
        int[] lookednumbers = new int[list.length];
        for(int i : list) {
            if (!isContain(lookednumbers,i)) {
                lookednumbers[index] = i;
                index++;
                fr = elemanSayar(list,i);
                System.out.println(i + " sayısı " + fr + " kere tekrar edildi.");
            }
        }
    }
}
