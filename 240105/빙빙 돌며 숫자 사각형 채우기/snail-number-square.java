import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static int m;

    public static boolean inRange(int x, int y) {
        if(x >= 0 && x < n && y >= 0 && y < m) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        int[][] rect = new int[n][m];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dirNum = 0;

        int x = 0, y = 0;

        rect[0][0] = 1;
        for(int i=2; i<=n * m; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!inRange(nx, ny) || rect[nx][ny] != 0)  // dirNum 계산을 먼저!
                dirNum = (dirNum + 1) % 4;

            x += dx[dirNum];
            y += dy[dirNum];

            rect[x][y] = i;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.printf("%d ", rect[i][j]);
            }
            System.out.println();
        }
    }
}