import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        hour = hour * 60;
        int cookingTime = Integer.parseInt(br.readLine());
        int temp = hour + minute + cookingTime;

        System.out.println((temp / 60 % 24) + " " + (temp % 60));
    }
}
