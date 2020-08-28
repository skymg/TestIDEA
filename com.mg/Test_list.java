import java.util.ArrayList;
import java.util.List;

public class Test_list {
    public static void main(String[] args) {
                List<String> list = new ArrayList();
                for(int i = 0; i <= 10; i++){
                    //向list中依次添加“ii”。
                    //例如，当i为0时，向list添加"00"；当i为1时，向list添加"11"。
                    StringBuilder sb = new StringBuilder();
                    sb.append(i).append(i);
                    list.add(sb.toString());
        }
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(Integer.MAX_VALUE);
    }
}
