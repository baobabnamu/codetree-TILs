import java.util.*;
public class Main {
    private final static int MAX_N = 1000;
    private final static int MAX_K = 10000;
    private final static int INT_MAX = Integer.MAX_VALUE;
    private final static int INT_MIN = Integer.MIN_VALUE;

    private static int n, k;
    private static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        nums = new int[n];

        // 1. 값 입력 받기
        int minNum = INT_MAX;
        int maxNum = INT_MIN;
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            minNum = Math.min(minNum, nums[i]);
            maxNum = Math.max(maxNum, nums[i]);
        }
        
        // 2. 완탐
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int cnt = calcCnt(i);
            ans = Math.max(ans, cnt);
        }
        // System.out.println(calcCnt(4));

        System.out.print(ans);
    }

    private static int calcCnt(int index) {
        int cnt = 0;
        int minNum = nums[index];
        int maxNum = nums[index];

        for(int i = 0; i < n; i++) {
            
            // System.out.println("minNum : " + minNum + ", nums[i] : " + nums[i] + ", result : " + Math.abs(minNum - nums[i]) + ", k : " + k);
            if(Math.abs(nums[i] - minNum) <= k && maxNum - minNum <= k) {
                cnt++;
                minNum = Math.min(minNum, nums[i]);
                maxNum = Math.max(maxNum, nums[i]);
            }
            // System.out.println("cnt : " + cnt);
        }

        return cnt;
    }

}