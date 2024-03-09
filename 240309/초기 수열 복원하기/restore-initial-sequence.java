import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n - 1];
        for(int i = 0; i < n - 1; i++) result[i] = sc.nextInt();

        // 2. 2중 for문 
            // 1) firstN : 1 ~ N까지의 모든 경우의 수 잡기
                // 2-1) i : 배열 만들기
                // 2-2) i : 만들어진 배열 검증하기
        for(int firstN = 1; firstN <= n; firstN++) {
            // 배열 생성
            int[] nums = new int[n];
            nums[0] = firstN;
            for(int i = 0; i < n - 1; i++) 
                nums[i + 1] = result[i] - nums[i];
            
            // 검증
            boolean satisfied = true;
            boolean[] useNums = new boolean[n];
            for(int i = 0; i < n; i++) {
                if(nums[i] < 1 || nums[i] > n) {
                    satisfied = false;
                    break;
                } else {
                    if(useNums[nums[i] - 1]) {
                        satisfied = false;
                        break;
                    }
                    useNums[nums[i] - 1] = true;
                } 
            }

            if(satisfied) {
                for(int num : nums) System.out.printf("%d ", num);
                return;
            }
        }
        
    }
}