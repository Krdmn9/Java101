import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;
        String burc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        yil = sc.nextInt();
        if (yil%12 == 0)  { burc = "Maymun"; }
        else if (yil%12 == 1) { burc = "Horoz"; }
        else if (yil%12 == 2) { burc = "Köpek"; }
        else if (yil%12 == 3) { burc = "Domuz"; }
        else if (yil%12 == 4) { burc = "Fare"; }
        else if (yil%12 == 5) { burc = "Fare"; }
        else if (yil%12 == 6) { burc = "Kaplan"; }
        else if (yil%12 == 7) { burc = "Tavşan"; }
        else if (yil%12 == 8) { burc = "Ejderha"; }
        else if (yil%12 == 9) { burc = "Yılan"; }
        else if (yil%12 == 10) { burc = "At"; }
        else { burc = "Koyun"; }
        System.out.println("Çin zodyağı burcunuz: " + burc);

    }
}
