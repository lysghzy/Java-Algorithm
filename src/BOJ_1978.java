import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] num = new int[n];
        int count = n;
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < n; i++) {
            if (num[i] == 1) {
                count--;
            }
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j == 0) {
                    count--;
                    break;
                }
            }

        }
        System.out.println(count);
    }
}
