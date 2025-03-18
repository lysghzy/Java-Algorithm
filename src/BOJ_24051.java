import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_24051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for(int i = 1;i < N;i++){
            int loc = i - 1;
            int newItem = A[i];
            while(0 <= loc&& newItem < A[loc]) {
                A[loc + 1] = A[loc];
                count++;
                if(count == K){
                    System.out.println(A[loc]);
                    return;
                }
                loc--;
            }
            if(loc + 1 != i){
                A[loc + 1] = newItem;
                count++;
                if(count == K){
                    System.out.println(A[loc]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
