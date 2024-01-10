import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());
        int[] nums = new int[N];

        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            nums[i] = Integer.parseInt(stk.nextToken());

        int max = INT_MIN;
        for(int i = 0; i <= N - K; i++) {
            int sum = 0;
            for(int j = i; j < i + K; j++)
                sum += nums[j];
            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}