import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int item = Integer.parseInt(br.readLine());
        for(int i = 0;i<item;i++) {
            String[] price = br.readLine().split(" ");
            totalPrice -= Integer.parseInt(price[0]) * Integer.parseInt(price[1]);
        }
        if(totalPrice == 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
