import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class BOJ_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int dot = 2;
        for(int i = 0; i < num;i++){
            dot += dot-1;
        }
        System.out.println((int)Math.pow(dot,2));
    }
}