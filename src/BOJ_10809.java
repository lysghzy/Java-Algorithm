import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] a = new int [26];
        for(int i = 0; i < a.length;i++){
            a[i] = -1;
        }
        for(int i = 0; i<s.length();i++){
            String str = s.substring(i,i+1);
            int b = s.indexOf(str);
            int c = (int) str.charAt(0) - 97;
            if(a[c] == -1) {
                a[c] = b;
            }
        }
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
