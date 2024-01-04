import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 1000;
    public static final int MAX_R = OFFSET * 2 + 1;

    public static int[][] place = new int[MAX_R][MAX_R];

    public static int calcRect() {
        // 남은 1번째 사각형의 최대 행 값 - 최소 행 값 * 최대 열 값 - 최소 열 값을 구해야 함.
        int area = 0;

        int minX = 2001;
        int maxX = 0;
        int minY = 2001;
        int maxY = 0;

        for(int i=0; i<place.length - 1; i++) {
            for(int j=0; j<place.length - 1; j++) {
                if(place[i][j] == 1) {
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        minX -= 1000;
        minY -= 1000;
        maxX -= 1000;
        maxY -= 1000;

        area = ((maxX + 1) - minX) * ((maxY + 1) - minY);       

        return area == 4000000 ? 0 : area;
        // return 0;
    }

    public static void addRect(int x1, int y1, int x2, int y2, boolean isTwo) {
        // 1번째 사각형이 먼저 입력되고, 2번째 사각형이 입력됨. 2번째 사각형에 의해서 1번째 사각형은 지워짐
        // 1번째 사각형을 '1'로 2번쨰 사각형을 '2'로 채우면 됨.
        int value = 1;
        if(isTwo) value = 2;
        for(int i=x1; i<x2; i++) {
            for(int j=y1; j<y2; j++) {
                place[i][j] = value;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<2; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(stk.nextToken()) + OFFSET;
            boolean isTwo = false;

            if(i==1) isTwo = true;
            addRect(x1, y1, x2, y2, isTwo);
        }

        System.out.print(calcRect());
    }
}