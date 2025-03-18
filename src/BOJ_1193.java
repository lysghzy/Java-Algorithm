import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int i = 0;
        int num1;
        int num2;
        while(true){
            i++;
            x -= i;
            if(x <= i + 1){
                if(x != 0) {
                    i++;
                }
                break;
            }
        }
        num1 = 1;
        num2 = i;
        for(int j = 1;j < x;j++){
            num1++;
            num2--;
        }
        if(i % 2 == 0){
            System.out.println(num1 + "/" + num2);
        } else{
            System.out.println(num2 + "/" + num1);
        }
    }
}
