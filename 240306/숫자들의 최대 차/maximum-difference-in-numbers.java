import java.util.*;
public class Main {
    private final static int MAX_N = 1000;
    private final static int MAX_K = 10000;
    private final static int INT_MAX = Integer.MAX_VALUE;
    private final static int INT_MIN = Integer.MIN_VALUE;

    private static int n, k;
    private static int[] nums;

    public static void main(String[] args) {
        // 주어지는 N개의 원소 개수
        // 최대로 차이날 수 있는 값 K
        // 숫자들을 적절하게 뽑아 최댓값과 최소값과의 차가 K 이하
        // 뽑을 수 있는 최대 숫자의 개수는?

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        nums = new int[n];

        // 1. 값 입력 받기
            // 입력 받은 값의 최솟값, 최댓값 구하기
        int minNum = INT_MAX;
        int maxNum = INT_MIN;
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            minNum = Math.min(minNum, nums[i]);
            maxNum = Math.max(maxNum, nums[i]);
        }
        
        // 2. 완탐
            // 1) i : minNum ~ maxNum까지 완탐
                // isContains(i) 함수 호출
                // true인 경우 2) 진행
                // 2) j : 0 ~ n까지 완탐
                    // calcCnt(i(최솟값 기준), ) 함수 호출
            // max 갱신

        int ans = 0;
        for(int i = minNum; i <= maxNum; i++) {
            if(isContains(i)) {
                int cnt = 0;
                for(int j = 0; j < n; j++) {
                    cnt = calcCnt(i);
                }
                ans = Math.max(ans, cnt);
            }
        }

        // System.out.println("result : " + calcCnt(3));

        System.out.print(ans);
    }

    private static int calcCnt(int minNum) {
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            // System.out.println("minNum : " + minNum + ", nums[i] : " + nums[i] + ", result : " + Math.abs(minNum - nums[i]) + ", k : " + k);
            if(Math.abs(minNum - nums[i]) <= k) {
                cnt++;
                minNum = Math.min(minNum, nums[i]);
            }
            // System.out.println("cnt : " + cnt);
        }

        return cnt;
    }

    private static boolean isContains(int number) {
        for(int num : nums) if(number == num) return true;
        return false;
    }
}