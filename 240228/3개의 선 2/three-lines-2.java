import java.util.*;

public class Main {
    private static final int MAX_L = 10;

    private static int[][] space;
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        space = new int[MAX_L + 1][MAX_L + 1];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            space[x][y] = 1;
        }

        int ans = 0;
        for(int i = 0; i <= MAX_L; i++) {
            for(int j = i + 1; j <= MAX_L; j++) {
                for(int k = j + 1; k <= MAX_L; k++) {
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