import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] str1 = {
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"}
        };
        String[][] str2 = {
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"},
                {"B", "W", "B", "W", "B", "W", "B", "W"}
        };
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        String[][] board = new String[N][M];
        for(int i = 0;i < N;i++){
            board[i] = br.readLine().split("");
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0;i <= N-8;i++){
            for(int j = 0; j <= M-8;j++){
                int count1 = 0;
                int count2 = 0;
                for(int k = i; k < i + 8;k++){
                    for(int l = j;l < j +8;l++){
                        if(!board[k][l].equals(str1[k - i][l - j])){
                            count1++;
                        }
                        if(!board[k][l].equals(str2[k - i][l - j])){
                            count2++;
                        }
                    }
                }
                min1 = Math.min(min1, count1);
                min2 = Math.min(min2, count2);
            }
        }
        System.out.println(Math.min(min1, min2));
    }
}
