import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] n = new boolean[246913];
        n[1] = true;
        for (int i = 2; i < n.length; i++) {
            if (!n[i]) {
                for (int j = i * 2; j < n.length; j += i) {
                    n[j] = true;
                }
            }
        }
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                int count = 0;
                for(int i = num + 1;i <= num * 2;i++){
                    if(!n[i]) {
                        count++;
                    }
                }
                System.out.println(count);
            } else{
                return;
            }
        }
    }
}
