import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,fib1 = 0,fib2 = 1,fibNext;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı fibonacci serisi istersiniz: ");
        n = input.nextInt();
        System.out.print(fib1 + " " + fib2 + " ");
        for(int i =2; i<n; i++) {
            fibNext = fib1 + fib2;
            System.out.print(fibNext + " ");
            fib1 = fib2;
            fib2 = fibNext;
        }
    }
}
