import java.util.*;
public class Main {
    private static final int MAX_N = 100;

    private static int[] nums = new int[MAX_N];
    private static int n, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // 1. 정렬 -> 최솟값, 최댓값 
        Arrays.sort(nums, 0, n);

        // 2. 6 3 7 3 5 -> 3 3 5 6 7 -> 
        // 최솟값과 최댓값을 잡기
        // cnt1 = 최솟값과 동일한 숫자 카운트
        // cnt2 = 최댓값과 동일한 숫자 카운트
        // 최솟값, 최댓값 중 더 적게 카운트된 숫자로 계산하기
        // 계산 방식 : 더 적게 카운트된 숫자를 기준으로 1씩 값에 영향 주기
        // 재배열 정렬
        // 완료되면 k 값 검증
        int diff = nums[n - 1] - nums[0];
        int cost = 0;
        // System.out.println("k : " + k + ", diff : " + diff);
        while(k < diff) {
            int maxCount = 0;
            int minCount = 0;

            for(int num : nums) {
                if(nums[n - 1] == num) maxCount++;
                if(nums[0] == num) minCount++;
            }
            
            if(maxCount > minCount) {
                int minValue = nums[0];
                for(int i = 0; i < nums.length; i++) {
                    if(minValue == nums[i]) {
                        nums[i]++;
                        cost++;
                    }
                }
                Arrays.sort(nums, 0, n);
            } 
            else {
                int maxValue = nums[n - 1];
                for(int i = 0; i < nums.length; i++) {
                    if(maxValue == nums[i]) {
                        nums[i]--;
                        cost++;
                    }
                }
                Arrays.sort(nums, 0, n);
            }

            diff = nums[n - 1] - nums[0];
        }

        System.out.print(cost);
        
    }
}