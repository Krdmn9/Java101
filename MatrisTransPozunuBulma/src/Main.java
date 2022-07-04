import java.util.*;
public class Main {

    public static void main(String[] args) {

        int[][] matris = {{1,2,3},{4,5,6}};
        //  1 2 3
        //  4 5 6
        int[][] transpose = new int[3][2];
        //   1 4
        //   2 5
        //   3 6
        for(int i = 0; i<matris.length;i++) {
            for(int k = 0; k<matris[i].length;k++) {
                transpose[k][i] = matris[i][k];
            }
        }
        System.out.println("Matris: ");
        for (int[] ints : matris) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
        System.out.println("Transpoz: ");
        for (int[] ints : transpose) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }

    }
}
