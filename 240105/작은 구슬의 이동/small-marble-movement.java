import java.io.*;
import java.util.*;

public class Main {
    public static int n;

    public static boolean inRange(int x, int y) {
        if(x >= 0 && y >= 0 && x < n && y < n) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        // 한 쪽으로 이동하다가 반대방향으로 이동하는 구슬.
        // 1초에 1칸씩 움직이고 방향 바꾸는 것도 1초 소요됨.
        // dx dy에 구슬 이동 범위 설정.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        int t = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        int nx = Integer.parseInt(stk.nextToken()) - 1; // 문제의 격자 구조에서 2차원 배열에 맞게 + 1
        int ny = Integer.parseInt(stk.nextToken()) - 1; 
        char d = stk.nextToken().charAt(0);

        // Up Right Left Down
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, 1, -1, 0};
        int dirNum = 0;

        if(d == 'U') {
            dirNum = 0;
        } else if(d == 'R') {
            dirNum = 1;
        } else if(d == 'L') {
            dirNum = 2;
        } else if(d == 'D') {
            dirNum = 3;
        }

        while(t-- > 0) {
            int x = nx + dx[dirNum];
            int y = ny + dy[dirNum];

            if(inRange(x, y)) {
                nx += dx[dirNum];
                ny += dy[dirNum];
            } else {
                dirNum = 3 - dirNum;
            }
        }

        System.out.printf("%d %d", nx + 1, ny + 1); // 2차원 배열에서 문제의 격자 구조에 맞게 + 1
    }
}