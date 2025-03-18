import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ_1000_2 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String [] num = br.readLine().split(" ");
        System.out.println(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));
    }
}