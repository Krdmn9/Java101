import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double arm=2.14, elm=3.67, dom=1.11, muz = 0.95, pat = 5,tutar;
        int arm_kg,elm_kg,dom_kg,muz_kg,pat_kg;
        System.out.print("Armut kaç kilo ? ");
        arm_kg = inp.nextInt();
        System.out.print("Elma kaç kilo ? ");
        elm_kg = inp.nextInt();
        System.out.print("Domates kaç kilo ? ");
        dom_kg = inp.nextInt();
        System.out.print("Muz kaç kilo ? ");
        muz_kg = inp.nextInt();
        System.out.print("Patlıcan kaç kilo ? ");
        pat_kg = inp.nextInt();
        tutar = arm*arm_kg+elm*elm_kg+dom*dom_kg+muz*muz_kg+pat*pat_kg;
        System.out.println("Tutar: " + tutar + " TL");
    }
}
