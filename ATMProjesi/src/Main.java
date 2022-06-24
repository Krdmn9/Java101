import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String default_id="emrekrdmn",default_password = "iyte123",user_id,user_password;
        int right=3,islem;
        int balance = 1500,tutar;
        boolean isExit=false;
        Scanner input = new Scanner(System.in);
        while (right>0 && !isExit) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            user_id = input.nextLine();
            System.out.print("Parolanızı giriniz: ");
            user_password = input.nextLine();
            if (user_password.equals(default_password) && user_id.equals(default_id)) {
                System.out.println("Giriş Başarılı");
                while (!isExit) {
                    System.out.println("Lütfen işlem seçiniz:\n1- Para Yatırma\n2- Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    islem = input.nextInt();
                    switch (islem) {
                        case 4:
                            System.out.println("İyi günler!");
                            isExit = true;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " TL");
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            tutar = input.nextInt();
                            if (tutar <= balance) {
                                balance -= tutar;
                                System.out.println("Para çekimi tamamlandı. Mevcut bakiyeniz: " + balance + " TL");
                            } else {
                                System.out.println("Girilen tutar mevcut bakiyeden fazla!");
                            }
                            break;
                        case 1:
                            System.out.print("Yatırmak istenilen tutarı giriniz: ");
                            tutar = input.nextInt();
                            balance += tutar;
                            System.out.println("Para yatırma tamamlandı. Mevcut bakiyeniz: " + balance + " TL");
                            break;
                        default:
                            System.out.println("Hatalı Seçim!");
                            break;
                    }
                }
            } else {
                System.out.println("Kullanıcı adı veya şifre hatalı!");
                right--;
                System.out.println("Kalan hakkınız: " + right);
            }
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur!");
            }
        }
    }
}
