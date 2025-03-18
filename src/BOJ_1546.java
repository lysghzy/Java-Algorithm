import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] grades = br.readLine().split(" ");
        double[] newGrades = new double[num];
        double max = 0;
        double sum = 0;
        for(int i = 0;i < num;i++){
            newGrades[i] = Integer.parseInt(grades[i]);
            if(newGrades[i] > max){
                max = newGrades[i];
            }
        }
        for(int i = 0;i < num;i++){
            sum += newGrades[i]/max*100;
        }
        System.out.println(sum / num);
    }
}
