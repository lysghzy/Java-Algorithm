import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        ArrayList<Integer> list = new ArrayList<>();
        int[] print = new int[N];
        for(int i = 0;i < N;i++){
            list.add(i + 1);
        }
        int index = 0;
        int count = 0;
        int a = 0;
        while(true){
            count++;
            if(count == K){
                print[a] = list.remove(index);
                index --;
                a++;
                if(list.isEmpty()){
                    break;
                }
                count = 0;
            }
            if(index < list.size() - 1) {
                index++;
            } else{
                index = 0;
            }
        }
        System.out.print("<");
        for(int i = 0;i < print.length; i++){
            if(i >= print.length - 1){
                System.out.print(print[i] + ">");
            } else{
                System.out.print(print[i] + ", ");
            }
        }
    }
}
