import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    public static final int MAX_R = OFFSET * 2 + 1;
    public static final int LENGTH = 8;

    public static int[][] place = new int[MAX_R][MAX_R];

    public static int calcArea() {
        int cnt = 0;

        for(int i=0; i<place.length - 1; i++) {
            for(int j=0; j<place.length - 1; j++) {
                if(place[i][j] >= 1) cnt++;
            }
        }

        return cnt;
    }

    public static void addRect(int x, int y) {
        for(int i=x; i<x+LENGTH; i++) {
            for(int j=y; j<y+LENGTH; j++) {
                place[i][j] += 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 위치는 input 기준. 가로 세로 길이가 8인 색종이가 N 장 주어짐
        // 즉 범위는 x, y ~ x+7, y+7 까지 1씩 증가 시키면 됨
        // arr에 1이 담겨있는 경우 넓이임.

        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken()) + OFFSET;
            int y = Integer.parseInt(stk.nextToken()) + OFFSET;

            addRect(x, y);
        }

        System.out.print(calcArea());
    }
}