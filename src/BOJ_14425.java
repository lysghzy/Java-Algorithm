import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        HashSet<String> hashSet_N = new HashSet<>();
        String[] str_M = new String[M];
        for (int i = 0; i < N; i++) {
            hashSet_N.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            str_M[i] = br.readLine();
        }
        int num = 0;
        for (int i = 0; i < M; i++) {
            if (hashSet_N.contains(str_M[i])) {
                num++;
            }
        }
        System.out.println(num);
    }
}
