import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for(int i=0; i<n; i++) nums[i] = Integer.parseInt(br.readLine());

        int minusCnt = 0;
        int plusCnt = 0;
        int ans = 1;
        for(int i=0; i<n; i++) {
            if(nums[i] < 0) {
                minusCnt++;
                plusCnt = 0;
                ans = Math.max(ans, minusCnt);
            } else if (nums[i] > 0) {
                minusCnt = 0;
                plusCnt++;
                ans = Math.max(ans, plusCnt);
            }
        }

        System.out.print(ans);
    }
}