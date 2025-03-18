import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int front = 0;
        int back = 0;
        int[] a = new int[2000000];
        for (int i = 0; i < N; i++) {
            String[] strings = br.readLine().split(" ");
            switch (strings[0]) {
                case "push":
                    a[back] = Integer.parseInt(strings[1]);
                    back++;
                    break;
                case "pop":
                    if (back != front) {
                        sb.append(a[front] + "\n");
                        front++;
                    } else {
                        sb.append(-1 + "\n");
                    }
                    break;
                case "size":
                    sb.append(back - front + "\n");
                    break;
                case "empty":
                    if (back == front) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if (back == front) {
                        sb.append("-1\n");
                    } else {
                        sb.append(a[front] + "\n");
                    }
                    break;
                case "back":
                    if (back == front) {
                        sb.append("-1\n");
                    } else {
                        sb.append(a[back - 1] + "\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
