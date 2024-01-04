import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 200;
    public static final int MAX_R = OFFSET * 2 + 1;

    public static int[][] place = new int[MAX_R][MAX_R];

    public static int countBlueRect() {
        int cnt = 0;
        for(int i=0; i<MAX_R; i++) {
            for(int j=0; j<MAX_R; j++) {
                if(place[i][j] == 2) cnt++;
            }
        }
        return cnt;
    }

    public static void addRect(int x1, int y1, int x2, int y2, int rectColor) {
        for(int i=x1; i<x2; i++) {
            for(int j=y1; j<y2; j++) {
                place[i][j] = rectColor;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 빨간색 1, 파란색 2
        // 최종적으로 2인 애들의 넓이 반환
        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int rectColor;

            if(i%2 == 0) rectColor = 1;
            else rectColor = 2;

            addRect(x1, y1, x2, y2, rectColor);
        }

        System.out.print(countBlueRect());
    }
}