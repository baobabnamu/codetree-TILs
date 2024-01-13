import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(nums);
        int minValue = nums[0];
        int minCnt = 0;
        for(int i = 0; i < N; i++) {
            if(minValue == nums[i]) minCnt++;
        }

        System.out.printf("%d %d", minValue, minCnt);
    }
}