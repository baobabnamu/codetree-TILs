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
        n = Integer.parseInt(br.readLine());
        int[][] place = new int[n][n];

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                place[i][j] = Integer.parseInt(stk.nextToken());
            }
        }


        int ans = 0;
        for(int x=0; x<n; x++) {
            for(int y=0; y<n; y++) {
                int cnt = 0;
                for(int dirNum=0; dirNum<4; dirNum++) {
                    int nx = x + dx[dirNum];
                    int ny = y + dy[dirNum];
                    if(inRange(nx, ny) && place[nx][ny] == 1) cnt++;
                }

                if(cnt >= 3) ans++;
            }
        }

        System.out.print(ans);
    }
}