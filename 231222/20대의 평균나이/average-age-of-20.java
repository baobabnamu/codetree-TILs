import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 
        int temp;
        int sum = 0;
        int cnt = 0;
        double avg;

        while(true)  {
            st = new StringTokenizer(br.readLine());        
            temp = Integer.parseInt(st.nextToken());
            if(temp < 20 || temp > 29) {
                avg = (double)sum/cnt;
                System.out.printf("%.2f", avg);
                break;
            } else {
                cnt++;
                sum += temp;
            }
        }
        
        
    }
}