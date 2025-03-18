import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        int num = 0;
        for(int i = 0;i < n;i++){
            String[] record = br.readLine().split(" ");
            if(record[1].equals("enter")){
                set.add(record[0]);
            } else{
                set.remove(record[0]);
            }
        }
        String[] arr = set.toArray(new String[set.size()]);
        Arrays.sort(arr, Collections.reverseOrder());
        for(String a : arr){
            System.out.println(a);
        }
    }
}
