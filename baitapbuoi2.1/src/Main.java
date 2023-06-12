import java.util.Scanner;

public class Main {
    public static StringBuilder chuyenDoi(String s) {
        StringBuilder daChuyenDoi = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == 'á' || a == 'à' || a == 'ạ' || a == 'ắ' || a == 'ặ' || a == 'ằ' || a == 'ă' || a == 'ấ' || a == 'ậ' || a == 'â' || a == 'ầ')
                a = 'a';
            else if(a == 'ọ' || a == 'ó' || a == 'ò' || a == 'ơ' || a == 'ớ' || a == 'ờ' || a == 'ợ' || a == 'ô' || a == 'ố' || a == 'ồ' || a == 'ộ')
                a='o';
            else if( a == 'é' || a == 'è' || a == 'ẹ' || a == 'ê' || a == 'ế' || a == 'ề' || a == 'ệ' )
                a='e';
            else if(a == 'í' || a == 'ì' || a == 'ị' )
                a='i';
            else if(a == 'ù' || a == 'ú' || a == 'ụ' || a == 'ư' || a == 'ừ' || a == 'ứ' || a == 'ự' )
                a='u';

            daChuyenDoi.append(a);
        }

        return daChuyenDoi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap vao chuỗi cần chuyển đổi :");
        String s;
        s = sc.nextLine();
        System.out.println(""+chuyenDoi(s));
    }
}