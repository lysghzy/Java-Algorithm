import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0;i < n;i++){
            HashMap<String, Integer> hashmap = new HashMap<>();
            int type = Integer.parseInt(br.readLine());
            for(int j = 0;j < type;j++){
                String str = (br.readLine().split(" "))[1];
                hashmap.put(str, hashmap.getOrDefault(str, 0) + 1);
            }
            int result = 1;
            for(int j : hashmap.values()){
                result *= j + 1;
            }
            System.out.println(result - 1);
        }
    }
}
