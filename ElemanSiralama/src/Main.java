import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static void bubbleSort(int[] arr, int n)
    {
        if (n == arr.length-1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int pos=0;
        int min = arr[n];
        for(int i=n;i<arr.length;i++) {
            if(arr[i]<=min){
                min = arr[i];
                pos = i;
            }
        }
        int temp;
        temp = arr[n];
        arr[n] = min;
        arr[pos] = temp;
        bubbleSort(arr,n+1);


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int elemanSayisi;
        int value;
        System.out.print("Eleman sayısını giriniz: ");
        elemanSayisi = scan.nextInt();
        int[] list = new int[elemanSayisi];
        for(int i = 1; i<=elemanSayisi;i++) {
            System.out.print(i + ". eleman: ");
            value = scan.nextInt();
            list[i-1] = value;
        }
        bubbleSort(list,0);
    }
}
