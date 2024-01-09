import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int S = Integer.parseInt(stk.nextToken());

        int[] nums = new int[N];
        int totalNums = 0;

        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)  {
            nums[i] = Integer.parseInt(stk.nextToken());
            totalNums += nums[i];
        }   
            
        int sumDiff = INT_MAX;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                int newSum = totalNums - nums[i] - nums[j];
                sumDiff = Math.min(sumDiff, Math.abs(S - newSum));
            }
        }

        System.out.print(sumDiff);
    }
}