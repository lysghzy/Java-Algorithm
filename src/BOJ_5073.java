import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] str = br.readLine().split(" ");
            if (str[0].equals("0") && str[1].equals("0") && str[2].equals("0")) {
                break;
            }
            int[] num = new int[3];
            int max = 0;
            for(int i = 0;i < 3;i++){
                num[i] = Integer.parseInt(str[i]);
                if(num[i] > max){
                    max = num[i];
                }
            }
            if(max >= num[0] + num[1] + num[2] - max){
                System.out.println("Invalid");
            } else if(num[0] == num[1] && num[0] == num[2]){
                System.out.println("Equilateral");
            } else if(num[0] == num[1] || num[0] == num[2] || num[1] == num[2]){
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
//Equilateral
//Isosceles
//Scalene
//Invalid

