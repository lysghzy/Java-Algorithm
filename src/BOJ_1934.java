import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int result;
        for(int i = 0;i < T;i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int gcd = GCD(a, b);
            System.out.println(gcd * (a / gcd) * (b / gcd));
        }
    }
    static int GCD(int a, int b) {
        while (true) {
            if (a > b) {
                a %= b;
                if (a == 0) {
                    return b;
                }
            } else {
                b %= a;
                if (b == 0) {
                    return a;
                }
            }
        }
    }
}
