import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        int[] arr = new int[26];
        int answer = 0;
        String pr = "";
        for(int i = 0;i < str.length(); i++){
            arr[str.charAt(i) - 65]++;
        }
        for(int i = 1; i < 26;i++){
            if (arr[i] > arr[answer]){
                answer = i;
                pr = "";
            } else if (arr[i] == arr[answer]){
                pr = "?";
            }
        }
        if(pr.equals("?")){
            System.out.println(pr);
        } else{
            System.out.println((char)(answer + 65));
        }
    }
}
