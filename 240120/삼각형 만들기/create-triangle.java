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
        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int x1 = xPoints[i], y1 = yPoints[i];
                    int x2 = xPoints[j], y2 = yPoints[j];
                    int x3 = xPoints[k], y3 = yPoints[k];

                    if(isParalled(x1, x2, x3, y1, y2, y3)) {
                        int temp = Math.abs(((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x2 * y1) + (x3 * y2) + (x1 * y3)));
                        ans = Math.max(ans, temp);
                    }
                }
            }
        }

        System.out.print(ans);
    }

    private static boolean isParalled(int x1, int x2, int x3, int y1, int y2, int y3) {
        return (x1 == x2 || x1 == x3 || x2 == x3) && (y1 == y2 || y1 == y3 || y2 == y3);
    }
}