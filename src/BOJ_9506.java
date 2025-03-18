import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
            if(n == -1){
                break;
            }
            int num = 0;
            for(int i = 1; i <= n / 2;i++){
                if(n % i == 0){
                    arr.add(i);
                    num += i;
                }
            }
            if(num == n){
                String[] x = new String[arr.size()];
                for(int i = 0;i < arr.size();i++){
                    x[i] = arr.get(i) + "";
                }
                System.out.println(n + " = " + String.join(" + ", x));
            } else{
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
