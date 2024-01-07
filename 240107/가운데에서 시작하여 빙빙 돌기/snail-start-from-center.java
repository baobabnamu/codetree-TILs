import java.io.*;
import java.util.*;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] rect = new int[n][n];

        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int dirNum = 0;

        int x = n / 2, y = n / 2;
        rect[x][y] = 1;

        int value = 2, move = 1;
        while(value <= n * n) {
            for(int i=0; i<2; i++) {
                for(int j=0; j<move; j++) {
                    if(value > n * n) break;
                    x += dx[dirNum];
                    y += dy[dirNum];
                    rect[x][y] = value++;
                }
                dirNum = (dirNum + 1) % 4; // move 값을 다 사용하면 방향 변경
            }
            move++;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++)
                System.out.printf("%d ", rect[i][j]);
            System.out.println();
        }
    }
}