import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Nguyễn Thị Ngọc Bích");
//
//        for(int i=1; i<= 100; i++){
//            if(i % 2 == 0)
//                System.out.println(i);
//        }
//
//        System.out.println("Nhập vào một số nguyên:");
//        Scanner scanner = new Scanner(System.in);
//
//        int number = scanner.nextInt();
//        System.out.println("Số nguyên bạn vừa nhập là: "+ number);

        System.out.println("Nhập vào tên của bạn: ");
        Scanner scanner  = new Scanner(System.in);

        String myName  = scanner.nextLine();
        System.out.println("Tên vừa nhập là: " + myName);

        System.out.println(" Số ký tự trong tên của bạn là: ");
        System.out.println(myName.length());
    }
}