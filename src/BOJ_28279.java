import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] intarr = new int[N * 2];
        int front = N - 1; //다음으로 숫자를 넣을 곳
        int back = N; //다음으로 숫자를 넣을곳
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            switch (a) {
                case 1:
                    int b = Integer.parseInt(str[1]);
                    intarr[front] = b;
                    front--;
                    break;
                case 2:
                    int c = Integer.parseInt(str[1]);
                    intarr[back] = c;
                    back++;
                    break;
                case 3:
                    if (back - front == 1) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(intarr[front + 1] + "\n");
                        front++;
                    }
                    break;
                case 4:
                    if (back - front == 1) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(intarr[back - 1] + "\n");
                        back--;
                    }
                    break;
                case 5:
                    sb.append(back - front - 1 + "\n");
                    break;
                case 6:
                    if (back - front == 1) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case 7:
                    if (back - front == 1) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(intarr[front + 1] + "\n");
                    }
                    break;
                case 8:
                    if (back - front == 1) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(intarr[back - 1] + "\n");
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}
