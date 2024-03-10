import java.util.*;

public class Main {
    private static final int MAX_N = 1000;
    private static final int MAX_H = 100;
    private static final int BASE_DIFF = 17;
    private static final int INT_MAX = Integer.MAX_VALUE;

    private static int n, minVal, maxVal;
    private static int[] arr;

    public static void main(String[] args) {
        // 높이가 0 ~ 100인 언덕이 총 N개 주어짐.
        // 언덕의 높이를 x만큼 올릴때나 x만큼 깎을 때 가격 x*x 
        // N개의 언덕 중 가장 높은 언덕과 가장 낮은 언덕의 높이차 17 이하로 되도록 만들어야할 때 들어가는 최소 비용을 구하여라

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        // 알고리즘
        // 1. 2중 for문 
        // 1) i : 제일 낮은 언덕, 제일 높은 언덕의 조합을 반복
            // 2) j : arr 순회하면서 언덕을 제일 낮은 언덕으로 만드는 비용과 제일 높은 언덕으로 만드는 비용 중 더 작은 것을 기준으로 cost에 누적함
        // 총 누적된 비용 적은 값으로 갱신

        int ans = INT_MAX;
        for(int i = 0; i <= MAX_H; i++) {
            minVal = i;
            maxVal = i + BASE_DIFF;
            int cost = 0;
            for(int j = 0; j < n; j++) {
                if(minVal <= arr[j] && maxVal >= arr[j]) continue;
                cost += calcCost(arr[j]);
            }
            ans = Math.min(ans, cost);
        }
        System.out.print(ans);
    }

    private static int calcCost(int value) {
        int diff = Math.min(Math.abs(maxVal - value), Math.abs(minVal - value));
        return diff * diff;
    }
}