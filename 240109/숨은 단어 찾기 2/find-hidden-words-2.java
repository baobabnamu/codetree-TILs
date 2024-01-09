import java.io.*;
import java.util.*;

public class Main {
    // 상 하 좌 우 대각좌상 대각좌하 대각우상 대각우하
    private static final int MAX_DIRNUM = 8;
    private static int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
    private static int[] dy = {0, 0, -1, 1, -1, -1, 1, 1};
    private static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        char[][] grid = new char[n][m];
        
        for(int i = 0; i < n; i++) {
            char[] temp = br.readLine().toCharArray();
            for(int j = 0; j < m; j++) {
                grid[i][j] = temp[j];
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] != 'L') continue;
                for(int dirNum = 0; dirNum < MAX_DIRNUM; dirNum++) {
                    int x = i;
                    int y = j;

                    int nx = x + dx[dirNum];
                    int ny = y + dy[dirNum];

                    if(inRange(nx, ny) && grid[nx][ny] == 'E') {
                        nx += dx[dirNum];
                        ny += dy[dirNum];
                        if(inRange(nx, ny) && grid[nx][ny] == 'E') 
                            cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

}