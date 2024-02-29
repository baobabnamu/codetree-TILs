import java.util.*;

public class Main {
    private static final int MAX_N = 100;
    private static final int MAX_L = 100;
    private static final int INT_MAX = Integer.MAX_VALUE;

    private static int[] xArr = new int[MAX_N];
    private static int[] yArr = new int[MAX_N];
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // 1. 좌표평면에 점 입력 받기
            // 좌표평면에서 홀수는 점만 갈 수 있고, 짝수는 선만 갈 수 있음.
        for(int i = 0; i < n; i++) {
            xArr[i] = sc.nextInt();
            yArr[i] = sc.nextInt();
        }

        // 2. 가로 선, 세로 선 1개씩 그리기 *짝수 기준
        int ans = INT_MAX;
        for(int width = 2; width <= MAX_L; width += 2) {
            for(int height = 2; height <= MAX_L; height += 2) {
                int cnt = calcPoint(width, height);
                ans = Math.min(ans, cnt);
            }
        }

        System.out.print(ans);

    }

    private static int calcPoint(int width, int height) {
        // 3. 선 기준으로 각 좌표평면에서 점 개수 세기
            // 1사분면 : 가로 선 <= 점 && 세로 선 <= 점
            // 2사분면 : 가로 선 <= 점 && 세로 선 >= 점
            // 3사분면 : 가로 선 >= 점 && 세로 선 >= 점
            // 4사분면 : 가로 선 >= 점 && 세로 선 <= 점
        int oneQuadrant = 0, twoQuadrant = 0, threeQuadrant = 0, fourQuadrant = 0;

        for(int i = 0; i < n; i++) {
            if(xArr[i] > width && yArr[i] > height) oneQuadrant++;
            else if(xArr[i] > width && yArr[i] < height) twoQuadrant++;
            else if(xArr[i] < width && yArr[i] < height) threeQuadrant++;
            else if(xArr[i] < width && yArr[i] > height) fourQuadrant++;
        }


        int maxCnt = 0;

        // 4분면 점 개수 중 제일 큰 값 구하기
        maxCnt = Math.max(oneQuadrant, Math.max(twoQuadrant, Math.max(threeQuadrant, fourQuadrant)));

        return maxCnt;
    }
}