import java.util.*;

public class Main {
    private static final int MAX_N = 100;
    private static final int MAX_NUMBER = MAX_N * MAX_N;

    private static int n, m;
    private static int[] nums = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int ans = MAX_NUMBER;
        for(int i = 1; i <= MAX_NUMBER; i++) {
            boolean possible = true;
            int section = 1;
            int sum = 0;

            for(int j = 0; j < n; j++) {
                if(nums[j] > i) {
                    possible = false;
                    break;
                }

                if(nums[j] + sum > i) {
                    section++;
                    sum = 0;
                }

                sum += nums[j];
            }

            if(possible && section <= m) {
                ans = i;
            }
        }

        System.out.print(ans);
    }
}