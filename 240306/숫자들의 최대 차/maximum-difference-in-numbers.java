import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

        Arrays.sort(nums);

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 1;
            for(int j = i + 1; j < n; j++) {
                if(nums[j] - nums[i] <= k) 
                   cnt++;
            }
            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}