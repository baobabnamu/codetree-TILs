import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    public static final int MAX_R = OFFSET * 2 + 1;

    public static int[][] space = new int[MAX_R][MAX_R];

    public static int calcArea() {
        int result = 0;

        for(int i=0; i<space.length - 1; i++) {
            for(int j=0; j<space.length - 1; j++) {
                if(space[i][j] == 1) result++;
            }
        }

        return result;
    }

    public static void moveRect(int x1, int y1, int x2, int y2) {
        for(int i=x1; i<x2; i++) {
            for(int j=y1; j<y2; j++) {
                space[i][j] = 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // x1, y1 ~ x2 - 1, y2 - 1 까지가 2차원 배열에 옮겼을 때임
        // 넓이 = 2차원 배열의 1의 갯수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(stk.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(stk.nextToken()) + OFFSET;

            moveRect(x1, y1, x2, y2);
        }

        System.out.print(calcArea());
    }
}