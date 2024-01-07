import java.io.*;
import java.util.*;

public class Main {
    public static int n, m;

    public static boolean inRange(int x, int y) {
        if(x >= 0 && x < n && y >= 0 && y < m) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        int len = n * m;
        int[][] rect = new int[n][m];

        // Right -> Down -> Left -> Up
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dirNum = 0;

        int x = 0, y = 0;
        rect[x][y] = 65;
        int value = 66;
        for(int i=2; i<=len; i++) {
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!inRange(nx, ny) || rect[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
            }

            x += dx[dirNum];
            y += dy[dirNum];
            if(value > 90) value = 65;
            rect[x][y] = value++;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.printf("%c ", Integer.valueOf(rect[i][j]));
            }
            System.out.println();
        }
    }
}