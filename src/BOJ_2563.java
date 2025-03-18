import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] paper = new int[100][100];
        int n = Integer.parseInt(br.readLine());
        for(int i = 0;i < n; i++){
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            for(int a = y;a < y + 10;a++){
                for(int b = x;b < x + 10;b++){
                    paper[a][b] = 1;
                }
            }
        }
        int result = 0;
        for(int i = 0;i < 100;i++){
            for(int j = 0;j < 100;j++){
                if(paper[i][j] == 1){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
