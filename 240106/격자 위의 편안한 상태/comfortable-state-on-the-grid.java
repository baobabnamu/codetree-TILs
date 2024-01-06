import java.io.*;
import java.util.*;

public class Main {
    public static int n;

    public static boolean inRange(int x, int y) {
        if(x >= 0 && x < n && y >= 0 && y < n) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[][] rect = new int[n][n];
        int[] dx = {-1, 1, 0, 0}; // U D R L
        int[] dy = {0, 0, 1, -1};

        for(int i=0; i<m; i++) {
            stk = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(stk.nextToken()) - 1;
            int c = Integer.parseInt(stk.nextToken()) - 1;
            int cnt = 0;
            int status = 0;

            rect[r][c] = 1;
            for(int dirNum=0; dirNum<4; dirNum++) {
                int nx = r + dx[dirNum];
                int ny = c + dy[dirNum];

                if(inRange(nx, ny) && rect[nx][ny] != 0) {
                    cnt++;
                }
            }

            if(cnt == 3) status = 1;
            System.out.printf("%d\n", status);
        }
    }
}