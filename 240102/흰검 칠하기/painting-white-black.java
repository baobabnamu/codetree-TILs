import java.io.*;
import java.util.*;

class Tile {
    int whiteCount, blackCount, curColor;

    Tile() {}

    public Tile(int whiteCount, int blackCount, int curColor) {
        this.whiteCount = whiteCount;
        this.blackCount = blackCount;
        this.curColor = curColor; // 화이트(0), 블랙(1) 중 제일 마지막에 칠해진 색, 미선택된 경우 -1
    }

    public boolean isGray() {
        if(this.whiteCount >= 2 && this.blackCount >= 2) {
            return true;
        }
        return false;
    }
}

public class Main {
    public static final int MAX_N = 1000;
    public static final int MAX_X = 100;
    public static final int MAX_R = 100000*2+1;
    public static final int OFFSET = 100000;

    public static Tile[] tiles = new Tile[MAX_R];
    public static int[] visited = new int[MAX_R];

    public static int[] countTiles() {
        // 타일을 조회하면서 타일이 그레이라면 그레이 카운팅
        // curColor가 0이면 화이트, 1이면 블랙
        int white = 0;
        int black = 0;
        int gray = 0;
        for(int i=0; i<tiles.length - 1; i++) {
            if(tiles[i] == null) {
                continue;
            }

            if(tiles[i].isGray()) {
                gray++;
            } else {
                if (tiles[i].curColor == 0) {
                    white++;
                } else if (tiles[i].curColor == 1) {
                    black++;
                } 
            }
        }

        int[] tileColors = {white, black, gray};
        return tileColors;
    }

    public static void location(int left, int right, char dir) {
        left += OFFSET;
        right += OFFSET;

        for(int i=left; i<right; i++) {
            if(visited[i] == 0) {
                tiles[i] = new Tile(0, 0, -1);
                visited[i] = 1;
            }
            if(dir == 'L') {
                tiles[i].whiteCount += 1;
                tiles[i].curColor = 0;
            } else {
                tiles[i].blackCount += 1;
                tiles[i].curColor = 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int initPoint = 0;
        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int move = Integer.parseInt(stk.nextToken());
            char dir = stk.nextToken().charAt(0);

            int leftPoint = initPoint;
            int rightPoint = initPoint;

            if(dir == 'L') {
                leftPoint -= move;
                initPoint -= move;
            } else {
                rightPoint += move;
                initPoint += move;
            }

            location(leftPoint, rightPoint, dir);
        }

        int[] tileColors = countTiles();
        System.out.printf("%d %d %d", tileColors[0], tileColors[1], tileColors[2]);
    }
}