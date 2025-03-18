import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] string = br.readLine().split(" ");
        int n = Integer.parseInt(string[0]);
        int m = Integer.parseInt(string[1]);
        int[] basket = new int[n + 1];
        for(int i = 1;i <= n;i++){
            basket[i] = i;
        }
        for(int i = 0;i < m;i++){
            String[] num = br.readLine().split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            for(int ii = a;ii <= (b + a) / 2;ii++){
                int temp = basket[b + a - ii];
                basket[b + a - ii] = basket[ii];
                basket[ii] = temp;
            }
        }
        for(int i = 1;i <= n;i++){
            System.out.print(basket[i] + " ");
        }
    }
}

