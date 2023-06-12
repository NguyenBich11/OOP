import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class RanDom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int memberCount;
        System.out.println("Nhập vào số người cần chia nhóm : ");
        memberCount = sc.nextInt();
        sc.nextLine();
        String[] memberList = new String[memberCount];
        System.out.println("Nhập họ tên sinh viên :");
        for (int i = 0; i < memberCount; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));
            memberList[i] = sc.nextLine();
        }
        System.out.println("Danh sách sinh viên");
        for (int i = 0; i < memberCount; i++) {
            memberList[i] = (i + 1) + "." + memberList[i];
            System.out.println("" + memberList[i]);
        }
        System.out.println("Nhập vào số người trong 1 nhóm : ");
        int teamSize;
        teamSize = sc.nextInt();
        // Khai báo mảng tạm nhằm lưu lại các số sau khi ranDom
        String tam[] = new String[memberCount];
        ArrayList<Integer> list = new ArrayList<Integer>();
                for (int i = 1; i <= memberCount; i++) {
                    list.add(new Integer(i));
                }
                Collections.shuffle(list);
                for (int i = 0; i < memberCount; i++) {
                    tam[i]= String.valueOf(list.get(i));}
                System.out.println(list);
                // Cập nhật giá trị của mảng tạm khi ranDom xong
                upD(memberList,tam,memberCount);
                int j=1;
            for (int i = 0; i < memberCount; i++) {
                if (i % teamSize == 0) {
                    System.out.println("Nhóm " + j);
                    j = j + 1;
                }
                System.out.println("" + tam[i]);
            }

        }
        // Hàm cập nhật
        public static void upD(String memberList[],String tam[],int memberCount ) {
            String Tam1;
            String Tam2;
            for (int j = 0; j < memberCount; j++) {
                for (int i = 0; i < memberCount; i++) {
                    Tam1 = memberList[j];
                    Tam2 = tam[i];
                    if (Tam1.charAt(0) == Tam2.charAt(0))
                        // nếu 2 kí tự đầu tiên bằng nhau thì gán chuỗi tạm = chuỗi trong danh sách sinh viên
                        tam[i] = memberList[j];
                }

            }
        }
}


