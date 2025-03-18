import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int v = Integer.parseInt(str[2]);
        if(a == v){
            System.out.println("1");
            System.exit(0);
        }
        v -= a;
        int z = v / (a - b);
        if(v % (a - b) != 0){
            z ++;
        }
        z++;
        System.out.println(z);
    }
}
