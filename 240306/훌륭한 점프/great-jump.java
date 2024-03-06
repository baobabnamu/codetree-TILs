import java.util.*;

public class Main {
    private final static int INT_MAX = Integer.MAX_VALUE;

    private static int[] stones;
    private static int n, k;

    public static void main(String[] args) {
        // n개의 돌들이 1~n까지 순서대로 놓여져 있음.
        // k 이내로만 점프가 가능
        // 1번 시뮬레이션당 내가 건넌 돌 중의 최댓값이 나옴.
        // 그 돌 최댓값 중 제일 작은 값이 나오는 경우를 구하여라.

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        stones = new int[n];
        for(int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }

        int ans = INT_MAX;
        for(int i = Math.max(stones[0], stones[n - 1]); i <= 100; i++) {
            if(isPossible(i)) 
                ans = Math.min(ans, i);
        }

        System.out.print(ans);
    }

    private static boolean isPossible(int maxVal) {
        int[] availaleIndexs = new int[n];
        int cnt = 0;

        // maxVal 보다 낮은 돌만 인덱스에 추가
        for(int i = 0; i < n; i++) {
            if(stones[i] <= maxVal) {
                availaleIndexs[cnt++] = i;
            }
        }

        
        // 인덱스 값을 기준으로 k칸을 넘게 차이난다면 false
        for(int i = 1; i < cnt; i++) {
            int dist = availaleIndexs[i] - availaleIndexs[i - 1];
            if(dist > k)
                return false;
        }

        return true;
    }
}