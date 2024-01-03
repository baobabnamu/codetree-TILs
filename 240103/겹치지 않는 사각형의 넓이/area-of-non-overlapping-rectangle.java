import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 1000;
    public static final int MAX_R = OFFSET * 2 + 1;

    public static int[][] place = new int[MAX_R][MAX_R];

    public static int calcArea() {
        int cnt = 0;
        for(int i=0; i<place.length - 1; i++) {
            for(int j=0; j<place.length - 1; j++) {
                if(place[i][j] == 1) cnt++;
            }
        }

        return cnt;
    }

    public static void addRect(int x1, int y1, int x2, int y2, boolean isM) {
        int value = 1;
        if(isM) value = 0;

        for(int i=x1; i<x2; i++) {
            for(int j=y1; j<y2; j++) {
                place[i][j] = value;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 좌표평면 위에 A, B, M 직사각형이 주어짐
        // M이 A, B를 가릴 거임.
        // 안 가려진 A, B의 넓이

        // 1) A, B 직사각형 크기만큼 1로 덮음
        // 2) M인 경우 0으로 다시 덮음
        // 3) 1 카운팅

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<3; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(stk.nextToken()) + OFFSET;
            boolean isM = false;

            if(i==2) isM = true; 
            addRect(x1, y1, x2, y2, isM);
        }

        System.out.print(calcArea());
    }
}