import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int result = 1;
        for (int i = N; i > N - K; i--) {
            result *= i;
        }
        for (int i = 2; i <= K; i++) {
            result /= i;
        }
        System.out.println(result);
    }
}