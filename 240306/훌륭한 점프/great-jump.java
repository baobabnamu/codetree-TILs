import java.util.*;

public class Main {
    private final static int MAX_R = 100;
    private final static int INT_MAX = Integer.MAX_VALUE;

    private static int n, k;
    private static int[] stones;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        stones = new int[n];
        for(int i = 0; i < n; i++) stones[i] = sc.nextInt();

        int ans = INT_MAX;
        for(int i = Math.max(stones[0], stones[n - 1]); i <= MAX_R; i++) {
            if(isPossible(i)) {
                ans = Math.min(ans, i);
            }
        }

        System.out.print(ans);
    }

    private static boolean isPossible(int maxVal) {
        int[] availableIndexs = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(stones[i] <= maxVal) {
                availableIndexs[cnt++] = i;
            }
        }

        for(int i = 1; i < n; i++) {
            int dist = availableIndexs[i] - availableIndexs[i - 1];
            if(dist > k) {
                return false;
            }
        }

        return true;
    }
}