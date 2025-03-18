
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class BOJ_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = Arrays.stream(num).boxed().collect(Collectors.toSet());
        int M = Integer.parseInt(br.readLine());
        int[] num2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i : num2) {
            if (set.contains(i)) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}