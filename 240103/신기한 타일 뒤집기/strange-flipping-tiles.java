import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_N = 1000;
    public static final int MAX_X = 100;
    public static final int OFFSET = 100000;
    public static final int MAX_R = OFFSET*2+1;

    // 0 : gray, 1 : white, 2 : black
    public static int[] tiles = new int[MAX_R];

    public static int[] countTiles() {
        int w = 0;
        int b = 0;
        for(int i=0; i<tiles.length - 1; i++) {
            if(tiles[i] == 1) w++;
            else if (tiles[i] == 2) b++;
        }

        return new int[] {w, b};
    }

    public static int location(int cur, int move, char dir) {
        while(move-- > 0) {
            if(dir == 'L') {
                tiles[cur] = 1;
                if(move > 0) cur--;
            } else {
                tiles[cur] = 2;
                if(move > 0) cur++;
            }
        }

        return cur;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 왼쪽 이동 시 흰색으로 변경, 오른쪽 이동 시 검은색으로 변경
        // 변경되는 타일은 현재 위치 포함임. 즉, move 값이 1일 때는 변경되지 않음.
        // 원점에서 재시작하는 것이 아니라. 마지막으로 뒤집은 타일 위치에 서있음.

        int cur = OFFSET;
        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int move = Integer.parseInt(stk.nextToken());
            char dir = stk.nextToken().charAt(0);
            cur = location(cur, move, dir);
        }

        int[] result = countTiles();
        System.out.printf("%d %d", result[0], result[1]);
    }
}