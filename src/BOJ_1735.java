import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int A = Integer.parseInt(str[1]); //분모
        String[] str1 = br.readLine().split(" ");
        int b = Integer.parseInt(str1[0]);
        int B = Integer.parseInt(str1[1]);

        int least = GCD(A, B);
        int max = A * B / least;
        a = max / A * a;
        b = max / B * b;
        least = GCD(a + b, max);
        System.out.println((a + b) / least + " " + max / least);
    }
    public static int GCD(int A, int B) {
        while (true) {
            if (A > B) {
                A %= B;
                if (A == 0) {
                    return B;
                }
            } else {
                B %= A;
                if (B == 0) {
                    return A;
                }
            }
        }
    }
}
