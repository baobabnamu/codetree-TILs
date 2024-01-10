import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] nums = new double[N];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Double.parseDouble(stk.nextToken());
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                int cnt = 0;
                double sum = 0;

                for(int k = i; k <= j; k++) {
                    sum += nums[k];
                    cnt++;
                }

                double avg = sum / cnt;

                for(int k = i; k <= j; k++) {
                    if(avg == nums[k]) {
                        ans++;
                        break;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}