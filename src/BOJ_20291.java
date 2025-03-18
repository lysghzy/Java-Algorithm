import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("\\.");
            hashMap.put(str[1], hashMap.getOrDefault(str[1], 0) + 1);
        }
        String[] strings = hashMap.keySet().toArray(new String[0]);
        Arrays.sort(strings);
        for (String s : strings) {
            System.out.println(s + " " + hashMap.get(s));
        }
    }
}
