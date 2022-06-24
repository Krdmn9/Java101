import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username,def_username="emrekrdmn",password,def_password="1234",n_password;
        byte changer;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        username = inp.nextLine();
        System.out.print("Parolanızı giriniz: ");
        password = inp.nextLine();
        if(username.equals(def_username) && password.equals(def_password)) {
            System.out.println("Giriş başarılı!");
        }
        else if (password.equals(def_password)) {
            System.out.println("Kullanıcı adı hatalı!");
        }
        else if (username.equals(def_username)) {
            System.out.println("Parola hatalı!");
            System.out.print("Sıfırlamak ister misiniz? (1=> Evet, 2=> Hayır) ");
            changer = inp.nextByte();
            if (changer == 1) {
                System.out.print("Yeni parolanızı giriniz: ");
                inp.nextLine();
                n_password = inp.nextLine();
                if (n_password.equals(def_password)) {
                    System.out.println("Şifre değiştirme başarısız farklı şifre deneyin!");
                }
                else {
                    System.out.println("Şifre değiştirme başarılı! ");
                }
            }
            else if (changer == 2){
                System.out.println("Şifre değişim talebinde bulunmadınız.");
            }
            else {
                System.out.println("Hatalı giriş");
            }
        }
        else {
            System.out.println("Bilgilerinizin ikisi de yanlış!");
        }
    }
}
