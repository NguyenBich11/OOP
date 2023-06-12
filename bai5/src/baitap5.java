import java.util.Scanner;
public class baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten : ");
        String ten = sc.nextLine();

        StringBuilder tenVietHoa = new StringBuilder();
        boolean vietHoa = true;

        for (int i = 0; i < ten.length(); i++) {
            char kyTu = ten.charAt(i);

            if (vietHoa) {
                tenVietHoa.append(Character.toUpperCase(kyTu));
                vietHoa = false;
            }
            else {
                tenVietHoa.append(Character.toLowerCase(kyTu));
            }

            if (Character.isWhitespace(kyTu)) {
                vietHoa = true;
            }
        }

        String tenDayDu = tenVietHoa.toString();
        System.out.println("Tên viết hoa của bạn là: " + tenDayDu);
    }
}

