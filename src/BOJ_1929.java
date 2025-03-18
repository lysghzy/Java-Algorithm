import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);
        boolean[] num = new boolean[end + 1];
        for(int i = 2;i <= Math.sqrt(num.length);i++){
            if(!num[i]) {
                for (int j = 2; j < num.length; j++) {
                    if(i * j < num.length) {
                        num[i * j] = true;
                    }
                }
            }
        }
        for(int i = start;i <= end;i++){
            if(!num[i] && i != 1){
                System.out.println(i);
            }
        }
    }
}
