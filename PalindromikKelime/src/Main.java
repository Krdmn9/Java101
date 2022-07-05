import java.util.*;
public class Main {
    public static boolean isPalindrom(String s1) { // emme
        if (s1.length()==0 || s1.length() == 1) {
            return true;
        }
        if (s1.charAt(0) == s1.charAt(s1.length()-1)) {
            return isPalindrom(s1.substring(1,s1.length()-1));
        }
        return false;
    }
    public static void main(String[] args) {
        String string = "arara";
        System.out.println(isPalindrom(string) ? string + " kelimesi palindromik bir kelimedir." :
                string + " kelimesi palindromik bir kelime değildir.");
    }
}
