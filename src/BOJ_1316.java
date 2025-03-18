import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[Integer.parseInt(br.readLine())];
        int count = 0;
        for(int i = 0;i < str.length;i++){
            str[i] = br.readLine();
        }
        for(int i = 0;i < str.length;i++){
            String answer = "";
            for(int a = 0;a < str[i].length();a++){
                if(answer.indexOf(str[i].charAt(a)) == -1){
                    answer += str[i].charAt(a);
                } else{
                    if(answer.indexOf(str[i].charAt(a)) != answer.length() - 1){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(str.length - count);
    }
}
