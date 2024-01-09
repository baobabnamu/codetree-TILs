import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_SIZE = 19;

    private static int[][] grid = new int[MAX_SIZE][MAX_SIZE];
    private static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1}; // 상하좌우 대각좌상 대각우상 대각좌하 대각우하
    private static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < MAX_SIZE; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < MAX_SIZE; j++)
                grid[i][j] = Integer.parseInt(stk.nextToken());
        }

        for(int i = 0; i < MAX_SIZE; i++) {
            for(int j = 0; j < MAX_SIZE; j++) {
                if(grid[i][j] == 0) continue;

                for(int dirNum = 0; dirNum < 8; dirNum++) {                    
                    int cnt = 1;
                    int x = i;
                    int y = j;

                    while(true) {
                        if(cnt >= 5) {
                            System.out.println(grid[i][j]);
                            System.out.print((i + 2 * dx[dirNum] + 1) + " " + (j + 2 * dy[dirNum] + 1));
                            return;
                        }

                        int nx = x + dx[dirNum];
                        int ny = y + dy[dirNum];

                        if(inRange(nx, ny) && grid[x][y] == grid[nx][ny]) {
                            x = nx;
                            y = ny;
                            cnt++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        System.out.print(0);
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < MAX_SIZE && y >= 0 && y < MAX_SIZE;
    }
}