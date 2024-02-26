import java.util.*;

public class Main {
    private static final int MAX_N = 100;
    private static final int INT_MAX = Integer.MAX_VALUE;

    private static int[] nums = new int[MAX_N];
    private static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++) 
            nums[i] = sc.nextInt();

        int ans = INT_MAX;
        for(int i = 0; i < n; i++) {
            nums[i] *= 2; // 하나의 숫자 선택 후 2배

            for(int j = 0; j < n; j++) {
                int res = calcNums(j);
                ans = Math.min(ans, res);
            }

            nums[i] /= 2;
        }
        
        System.out.print(ans);
    }

    private static int calcNums(int exceptIndex) {
        int sumDiff = 0;
        int[] tempNum = new int[n - 1]; // 1개 제외한 요소 길이
        int index = 0;

        // 1개의 값 제외하고 복사
        for(int i = 0; i < n; i++) {
            if(i == exceptIndex) continue;
            tempNum[index++] = nums[i];
        }

        // n - 2 : 인덱스 값 고려
        for(int i = 0; i < n - 2; i++) {
            sumDiff += Math.abs(tempNum[i] - tempNum[i + 1]);
        }

        return sumDiff;
    }
}