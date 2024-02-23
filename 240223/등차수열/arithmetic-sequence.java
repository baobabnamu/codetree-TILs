import java.io.*;
import java.util.*;

public class Main {
    private static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        nums = new int[n];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int start = 101;
        int end = 0;
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(stk.nextToken());
            start = Math.min(start, nums[i]);
            end = Math.max(end, nums[i]);
        }
        
        int ans = 0;
        for(int k = start; k <= end; k++) {
            int res = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) { // 중복 제거 대신 i + 1
                    int a1 = nums[i];
                    int a2 = nums[j];

                    if(isAp(a1, k, a2)) {
                        res++;
                    }
                }
            }
            ans = Math.max(ans, res);
        }

        System.out.print(ans);
    }

    private static boolean isAp(int a1, int k, int a2) {
        return (a2 - k) == (k - a1);
    }
}