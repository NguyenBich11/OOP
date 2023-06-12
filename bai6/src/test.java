import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        System.out.println("Cho bài thơ chưa căn lề sau:\n");
        String baiTho= "công cha như núi thái sơn\n" +
                "nghĩa mẹ như nước trong nguồn chảy ra\n" +
                "một lòng thờ mẹ kính cha\n" +
                "cho tròn chữ hiếu mới là đạo con\n";

        String[] dong= baiTho.split("\n");
        System.out.println(inPut(baiTho));

    }


    public static String inPut(String baiTho){
        List<String> baiThoHoanThanh = new ArrayList<>();
        String[] dong= baiTho.split("\n");
        int max=0;
        for(int i=0;i<dong.length;i++){
            if(max< dong[i].length()) {
                max = dong[i].length();
            }
        }

        for(int i=0;i<dong.length;i++){
            int doDaiDong = dong[i].trim().length();
            int khoangTrang= max-doDaiDong;
            int khoangTrangtruoc=khoangTrang/2;
            StringBuilder baiThoDaSua = new StringBuilder();
            for (int j = 0; j < khoangTrangtruoc; j++) {
                baiThoDaSua.append(" ");
            }
                baiThoDaSua.append(dong[i].trim());
            baiThoHoanThanh.add(baiThoDaSua.toString());
        }
        return String.join("\n", baiThoHoanThanh);
    }
}
