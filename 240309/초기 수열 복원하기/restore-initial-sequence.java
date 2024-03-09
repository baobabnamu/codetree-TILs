import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n - 1];
        for(int i = 0; i < n - 1; i++) res[i] = sc.nextInt();

        for(int firstN = 1; firstN <= n; firstN++) {
            int[] nums = new int[n];
            nums[0] = firstN;
            for(int i = 0; i < n - 1; i++) 
                nums[i + 1] = res[i] - nums[i];

            boolean satisfied = true;
            boolean[] useNums = new boolean[n];
            for(int i = 0; i < n; i++) {
                if(nums[i] < 1 || nums[i] > n || useNums[nums[i] - 1]) {
                    satisfied = false;
                    break;
                }
                useNums[nums[i] - 1] = true;
            }

            if(satisfied) {
                for(int num : nums) System.out.printf("%d ", num);
                break;
            }
        }

    }
}