import java.util.Scanner;
public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Nhập vào tên của bạn: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        StringBuilder tenVH = new StringBuilder();
        boolean vietHoa = true;

        for(int i=0; i<name.length(); i++){
            char kyTu = name.charAt(i);

            if(vietHoa){
                tenVH.append(Character.toUpperCase(kyTu));
                vietHoa = false;
            }else {
                tenVH.append(Character.toLowerCase(kyTu));
            }

            if(Character.isWhitespace(kyTu)){
                vietHoa = true;
            }
        }

        String allName = tenVH.toString();
        System.out.println("Tên viết hoa của bạn là: " + allName);
    }
}