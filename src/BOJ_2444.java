import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 0;i < num;i++){
            System.out.println(" ".repeat(num - i - 1) + "*".repeat(2 * i + 1));
        }
        for(int i = num - 2;i >= 0 ;i--){
            System.out.println(" ".repeat(num - i - 1) + "*".repeat(2 * i + 1));
        }
    }
}
