import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] xywh = br.readLine().split(" ");
        int num;
        int[] distances = new int[4];
        for(int i = 0;i < 4;i++){
            distances[i] = Integer.parseInt(xywh[i]);
        }
        int[] d = {distances[0], distances[1], distances[2] - distances[0], distances[3] - distances[1]};
        num = d[0];
        for(int i : d){
            if(num > i){
                num = i;
            }
        }
        System.out.println(num);
    }
}
