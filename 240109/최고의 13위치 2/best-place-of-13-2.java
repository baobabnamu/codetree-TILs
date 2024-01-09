import java.io.*;
import java.util.*;

public class Main {
    private static int n;
    private static int[][] grid;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        grid = new int[n][n];

        for(int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int max = 0;
        for(int x1 = 0; x1 < n; x1++) {
            for(int y1 = 0; y1 < n - 2; y1++) {
                for(int x2 = 0; x2 < n; x2++) {
                    for(int y2 = 0; y2 < n - 2; y2++) {
                        if(isEqualBox(x1, y1, x2, y2)) continue;

                        int box1 = grid[x1][y1] + grid[x1][y1 + 1] + grid[x1][y1 + 2];
                        int box2 = grid[x2][y2] + grid[x2][y2 + 1] + grid[x2][y2 + 2];
                        max = Math.max(max, box1 + box2);
                    }
                }
            }
        }

        System.out.print(max);
    }

    public static boolean isEqualBox(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2 && y1 + 1== y2 + 1 && y1 + 2 == y2 + 2;
    }
}