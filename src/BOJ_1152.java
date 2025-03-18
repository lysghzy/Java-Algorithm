import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
        int result = 0;
        for(String i : s){
            if(!i.isEmpty()){
                result++;
            }
        }
        System.out.println(result);
    }
}
