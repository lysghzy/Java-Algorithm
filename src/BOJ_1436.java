import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int n = 666;
        int count = 0;
        while(true){
            String copy = n + "";
            if(copy.contains("666")) {
                count++;
                if(count == num){
                    System.out.println(n);
                    break;
                }
            }
            n++;
        }
    }
}
