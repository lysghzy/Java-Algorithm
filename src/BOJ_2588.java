import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();
        int a = Integer.parseInt(String.valueOf(num2.charAt(0)));
        int b = Integer.parseInt(String.valueOf(num2.charAt(1)));
        int c = Integer.parseInt(String.valueOf(num2.charAt(2)));

        System.out.println(num1 * c);
        System.out.println(num1 * b);
        System.out.println(num1 * a);
        System.out.println(num1 * Integer.parseInt(num2));
    }
}
