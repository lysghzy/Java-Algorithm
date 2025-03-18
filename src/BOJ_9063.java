import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int k = Integer.parseInt(br.readLine());
        for(int i = 0;i < k; i++){
            int[] value = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            minX = Math.min(minX, value[0]);
            maxX = Math.max(maxX, value[0]);
            minY = Math.min(minY, value[1]);
            maxY = Math.max(maxY, value[1]);
        }
        System.out.println((maxX - minX) * (maxY - minY));
    }
}
