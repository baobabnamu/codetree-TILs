import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(stk.nextToken());
        int C = Integer.parseInt(stk.nextToken());
        char[][] rect = new char[R][C];

        for(int i=0; i<R; i++) {
            stk = new StringTokenizer(br.readLine());
            for(int j=0; j<C; j++)
                rect[i][j] = stk.nextToken().charAt(0);
        }

        // 이동의 경우의 수 구하기.
        // 이동은 항상 점프를 통해서 가능하다. 
        // 조건1 : 현재 위치의 색과 점프하려고 하는 칸의 색이 달라야 한다.
        // 조건2 : 현재 위치에서 적어도 한 칸이상 오른쪽에 위치이며 동시에 적어도 한 칸이상 아래쪽에 위치한 곳으로만 점프할 수 있다.
        // 조건3 : 시작, 도착 지점을 제외하고 점프하며, 도달한 위치가 정확히 2곳 뿐이어 한다.
        // 주의1 : 시작 지점은 0, 0을 말하며 도착 지점은 R - 1, C - 1이다.

        int cnt = 0;
        for(int i = 0; i < R - 1; i++) {
            for(int j = 0; j < C - 1; j++) {
                // i, j와 비교 대상은 k, l
                for(int k = i + 1; k < R - 1; k++) {
                    for(int l = j + 1; l < C - 1; l++) {
                        if(rect[0][0] != rect[i][j] && 
                            rect[i][j] != rect[k][l] &&
                            rect[k][l] != rect[R - 1][C - 1]) cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}