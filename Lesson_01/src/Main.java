import java.util.Scanner;
import java.lang.String;
import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap doan van ban: ");
        Scanner scan = new Scanner(System.in);

        String full = scan.nextLine();

        System.out.println("Doan van ban sau khi bo dau la: " + removeAccent(full));
    }
    public static String removeAccent(String full) {
        return Normalizer.normalize(full, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
    }
}

