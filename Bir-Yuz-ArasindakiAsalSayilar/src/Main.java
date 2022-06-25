public class Main {
    public static void main(String[] args) {
        int n = 100;
        boolean asalMi;
        for (int i = 2; i<n; i++) {
            asalMi = true;
            for (int k = 2; k<i ; k++) {
                if (i % k == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}
