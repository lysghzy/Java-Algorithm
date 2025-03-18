import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_23882 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rounds = 0;

        for(int last = N - 1;last > 0;last--){
            int max = last;
            for(int i = 0;i < last; i++){
                if(A[max] < A[i]){
                    max = i;
                }
            }
            if(last != max){
                int copy = A[last];
                A[last] = A[max];
                A[max] = copy;
                rounds++;
                if(rounds == K){
                    for(int i : A){
                        System.out.print(i + " ");
                    }
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
