import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] X = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] Xcopy = X.clone();
        Arrays.sort(Xcopy);
        long[] intarr = new long[2000000001];
        int num = 0;
        for(int i = 1;i < X.length;i++){
            if(Xcopy[i - 1] != Xcopy[i]){
                num++;
            }
            intarr[Xcopy[i] + 1000000000] = num;
        }
        for(int i = 0;i < X.length;i++){
            System.out.print(intarr[X[i]+ 1000000000] + " ");
        }
    }
}
