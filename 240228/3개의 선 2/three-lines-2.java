import java.util.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int INT_MIN = Integer.MIN_VALUE;

    private static int[][] space;
    private static int startX = INT_MAX, endX = INT_MIN, startY = INT_MAX, endY = INT_MIN;
    private static int n;

    public static void main(String[] args) {
        // 서로 다른 N개의 점이 좌표평면에 주어진다. 이때 x축 혹은 y축에 평행한 직선 3개로 주어진 모든 점들을 전부 지나게 할 수 있는지 판단해라.
        // 1. 서로 다른 N개의 점을 입력 받아 좌표평면에 표현하기
        // 2. 선을 그리기
            // 가로(0) 가로(1) 가로(2)
            // 가로(0) 가로(1) 세로(2)
            // 가로(0) 가로(1) 가로(3)
            // 가로(0) 가로(1) 세로(3)
            // ...
            // 가로(0) 세로(1) 가로(2)
            // 가로(0) 세로(1) 세로(2)
            // ...
            // *선 그릴 때마다 모든 좌표를 지나는지 확인 필요
            // 모든 좌표를 지난다면 바로 1 반환
            // 완탐수를 조금 줄이려면 최소 최댓값 구해서 하면 됨.
        // 3. 모든 완탐을 수행했음에도 1이 반환되지 않았다면 0 반환

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        space = new int[11][11];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            startX = Math.min(startX, x);
            endX = Math.max(endX, x);
            startY = Math.min(startY, y);
            endY = Math.max(endY, y);
            space[x][y] = 1;
        }

        int ans = 0;
        int start = Math.min(startX, startY);
        int end = Math.max(endX, endY);
        for(int i = 0; i <= 10; i++) {
            for(int j = i + 1; j <= 10; j++) {
                for(int k = j + 1; k <= 10; k++) {
                    ans = drawThreeLines(i, j, k);
                    if(ans == 1) {
                        System.out.print("1");
                        return;
                    }
                }
            }
        }

        System.out.print("0");
    }

    private static int drawThreeLines(int line1, int line2, int line3) {
        // 0: 가로, 1: 세로
        int[][] dirs = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 1},
                {1, 0, 0},
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 1}
            };

        for(int i = 0; i < 8; i++) {
            int dir1 = dirs[i][0];
            int dir2 = dirs[i][1];
            int dir3 = dirs[i][2];

            int cnt = 0;
            cnt += drawLine(line1, dir1);
            cnt += drawLine(line2, dir2);
            cnt += drawLine(line3, dir3);
            if(cnt == n) return 1;
        }

        return 0;
    }

    private static int drawLine(int line, int dir) {
        int cnt = 0;

        if(dir == 0) {
            for(int i = 0; i <= 10; i++) {
                if(space[line][i] == 1) cnt++;
            }
        } else {
            for(int i = 0; i <= 10; i++) {
                if(space[i][line] == 1) cnt++;
            }
        }

        return cnt;
    }
}