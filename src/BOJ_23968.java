import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_23968 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;

        for (int i = 0; i <= N - 2; i++) {
            for (int j = 0; j <= N - 2 - i; j++) {
                if (num[j] > num[j + 1]) {
                    count++;
                    int copy = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = copy;
                    if (count == K) {
                        System.out.println(num[j] + " " + num[j + 1]);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(-1);
    }
}