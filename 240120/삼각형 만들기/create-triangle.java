import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static int[] xPoints;
    private static int[] yPoints;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        xPoints = new int[N];
        yPoints = new int[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            xPoints[i] = Integer.parseInt(stk.nextToken());
            yPoints[i] = Integer.parseInt(stk.nextToken());
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                for(int k = j + 1; k < N; k++) {
                    int x1 = xPoints[i], y1 = yPoints[i];
                    int x2 = xPoints[j], y2 = yPoints[j];
                    int x3 = xPoints[k], y3 = yPoints[k];

                    if(isParalled(x1, x2, x3, y1, y2, y3)) {
                        int temp = Math.abs(((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x2 * y1) + (x3 * y2) + (x1 * y3))) / 2;
                        ans = Math.max(ans, temp);
                    }
                }
            }
        }

        System.out.print(ans * 2);
        // 2차평면 위 N개의 점 중 3개를 골라 삼각형을 만듬
        // 이때, 한 면은 x 축에 평행하고 다른 한 면은 y축에 평행해야 함.
        // -> x 축 평행 조건 : x 축이 평행하려면 세 개의 점 중 1번째 점(x,y)의 y와 2번째 점(x,y)의 y가 같아야 한다.
        // -> y 축 평행 조건 : y 축이 평행하려면 세 개의 점 중 3번째 점(x,y)의 x와 3번째 점(x,y)의 x가 같아야 한다.
        // 그 중에서 제일 큰 넓이에 2를 곱한 값은?
    }

    private static boolean isParalled(int x1, int x2, int x3, int y1, int y2, int y3) {
        return (x1 == x2 || x1 == x3 || x2 == x3) && (y1 == y2 || y1 == y3 || y2 == y3);
    }
}