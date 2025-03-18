import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int least = N / 3 + 1;
        for (int i = N / 3; i >= 0; i--) {
            if((N - i * 3) % 5 == 0){
                least = i + (N - i * 3) / 5;
            }
        }
        if(least == N / 3 + 1){
            System.out.println(-1);
        } else {
            System.out.println(least);
        }
    }
}
