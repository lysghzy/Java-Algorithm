import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int nearestNumber = 0;
        int sum;

        String[] str = br.readLine().split(" ");
        int[] num = new int[n];
        for(int i = 0; i < n;i++){
            num[i] = Integer.parseInt(str[i]);
        }
        for(int i = 0;i < n - 3;i++){
            for(int j = i + 1;j < n - 2;j++){
                for(int k = j + 1;k < n - 1;k++){
                    sum = num[i] + num[j] + num[k];
                    if(sum > nearestNumber && sum <= m){
                        nearestNumber = sum;
                    }
                }
            }
        }
        System.out.println(nearestNumber);
    }
}
