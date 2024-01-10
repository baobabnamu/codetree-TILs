import java.io.*;
import java.util.*;

public class Main {
    private static double[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        nums = new double[N];

        double sum = 0;
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Double.parseDouble(stk.nextToken());
            sum += nums[i];
        }
        
        int ans = N;

        double avgTotal = sum / N;
        for(int i = 0; i < N; i++) {
            if(avgTotal == nums[i]) {
                ans++;
                break;
            }
        }

        int k = 2;
        while(k <= N) {
            for(int i = 0; i <= N - k; i++) {
                double avg = calcAvg(i, k);
                for(int j = i; j < k; j++) {
                    if(avg == nums[j]) {
                        ans++;
                        break;
                    }
                }
            }
            k++;
        }



        System.out.print(ans);
    }

    private static double calcAvg(int startPoint, int size) {
        double sum = 0;
        for(int i = startPoint; i < size; i++)
            sum += nums[i];

        return sum / size;
    }
}