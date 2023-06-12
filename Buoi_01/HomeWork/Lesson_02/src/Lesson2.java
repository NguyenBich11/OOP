import java.util.ArrayList;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Bài thơ chưa căn lề: ");
        String text = "công cha như núi thái sơn\n" +
                "nghĩa mẹ như nước trong nguồn chảy ra\n" +
                "một lòng thờ mẹ kính cha\n" +
                "cho tròn chữ hiếu mới là đạo con\n";

        String[] row = text.split("\n");
        System.out.println(text);
        System.out.println("Bài thơ đã căn giữa là: ");
        System.out.println(output(text, row));
    }

    public static int max(String[] row){
        int max = 0;
        for (String s : row) {
            if (max < s.length()) {
                max = s.length();
            }
        }
        return max;
    }

    public static String output(String text, String[] row){
        List<String> completetext = new ArrayList<String>();

        for(int i=0; i<row.length; i++){
            int lineLen = row[i].trim().length();
            int space = max(row) - lineLen;
            int spaceBef = space/2;

            StringBuilder edittext = new StringBuilder();

                for(int j=0; j<spaceBef; j++){
                    edittext.append(" ");
                }
                edittext.append(row[i].trim());
            completetext.add(edittext.toString());
        }
        return String.join("\n", completetext);
    }
}


