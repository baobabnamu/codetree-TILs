import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] xArr = new int[N];
        int[] yArr = new int[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(stk.nextToken());
            yArr[i] = Integer.parseInt(stk.nextToken());
        }

        int distance = INT_MAX;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                int x1 = xArr[i], x2 = xArr[j];
                int y1 = yArr[i], y2 = yArr[j];
                
                int temp = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
                distance = Math.min(distance, temp);
            }
        }

        System.out.print(distance);
        // 점 사이 간 거리를 비교해서 가장 짧은 경우 값을 저장
    }
}