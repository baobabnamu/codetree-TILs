import java.io.*;
import java.util.*;

public class Main {
    public static int n;

    // init 함수 -> n은 무조건 홀수임. -> 1인 경우 00 3인 경우 11 5인 경우 22 7인 경우 33
    public static int initialize() {
        int initValue = n; 
        int cnt = -1;
        while(initValue % 2 == 1) {
            initValue -= 2;
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] rect = new int[n][n];

        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int dirNum = 0;

        int x = initialize();
        int y = initialize();
        rect[x][y] = 1;
        int value = 2;
        int move = 1;
        // R U L D 인데 몇 칸씩 움직일건가? // 1 1 2 2 3 3 4 4 5 5 순차적으로 증가함.
        // 그럼 언제 방향이 바뀌는가? move 값을 다 사용했을 때.
        while(value <= n * n) {
            for(int i=0; i<2; i++) {
                for(int j=0; j<move; j++) {
                    int nx = x + dx[dirNum];
                    int ny = y + dy[dirNum];
                        
                    if(value > n * n) break;
                    
                    x += dx[dirNum];
                    y += dy[dirNum];
                    rect[x][y] = value++;
                }
                dirNum = (dirNum + 1) % 4;
            }
            move++;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.printf("%d ", rect[i][j]);
            }
            System.out.println();
        }
    }
}