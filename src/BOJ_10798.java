import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];
        char[][] c = new char[5][15];
        for(int i = 0;i < 5;i++){
            str[i] = br.readLine();
        }
        for(int i = 0;i < 5;i++){
            for(int a = 0;a < 15;a++){
                if(a < str[i].length()) {
                    c[i][a] = str[i].charAt(a);
                } else{
                    c[i][a] = ' ';
                }
            }
        }
        for(int a = 0;a < 15;a++){
            for(int i = 0;i < 5;i++){
                if(c[i][a] != ' '){
                    System.out.print(c[i][a]);
                }
            }
        }
    }
}
