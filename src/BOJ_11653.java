import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 2;
        while(true){
            if(n == 1){
                break;
            }
            if(n % num == 0){
                n = n / num;
                System.out.println(num);
            } else {
                num++;
            }
        }
    }
}
