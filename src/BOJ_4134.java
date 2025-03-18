import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 0;i < num;i++){
            long n = Long.parseLong(br.readLine());
            while(true){
                long m = 0;
                for(long k = 2;k <= Math.sqrt(n);k++){
                    if(n % k == 0){
                        m++;
                        break;
                    }
                }
                if(n == 0 || n == 1){
                    n = 2;
                }
                if (m == 0){
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
    }
}
