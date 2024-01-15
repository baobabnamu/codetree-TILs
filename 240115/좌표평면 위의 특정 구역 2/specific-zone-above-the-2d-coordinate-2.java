import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_N = 100;
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int INT_MIN = Integer.MIN_VALUE;

    private static int N;
    private static int[] xArr = new int[MAX_N];
    private static int[] yArr = new int[MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(stk.nextToken());
            yArr[i] = Integer.parseInt(stk.nextToken());
        }

        int ans = INT_MAX;
        for(int i = 0; i < N; i++) { // 제외 시킬 조합 반복
            int minX = INT_MAX, minY = INT_MAX, maxX = INT_MIN, maxY = INT_MIN;
            for(int j = 0; j < N; j++) { // 제일 짧은 길이 계산
                if(i == j) continue;
                minX = Math.min(minX, xArr[j]);
                minY = Math.min(minY, yArr[j]);
                maxX = Math.max(maxX, xArr[j]);
                maxY = Math.max(maxY, yArr[j]);
            }
            int x = maxX - minX;
            int y = maxY - minY;
            ans = Math.min(ans, x * y);
        }

        System.out.printf("%d ", ans);
        // 입력받은 가로길이들 중에서 제일 긴 가로길이 - 제일 짧은 가로길이
        // 입력받은 세로길이들 중에서 제일 긴 세로길이 - 제일 짧은 세로길이
        // 두 개를 곱하여 넓이 값 구해서 최솟값 갱신
    }
}