import java.io.*;
import java.util.*;

public class Main {
    private static int n;
    private static int[][] grid;
    private static int[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        grid = new int[n][n];
        visited = new int[n][n];

        for(int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int maxCoin1 = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 2; j++) {
                maxCoin1 = Math.max(maxCoin1, grid[i][j] + grid[i][j + 1] + grid[i][j + 2]);
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 2; j++) {
                if(maxCoin1 == grid[i][j] + grid[i][j + 1] + grid[i][j + 2]) {
                    visited[i][j] = 1;
                    visited[i][j + 1] = 1;
                    visited[i][j + 2] = 1;
                }
            }
        }

        int maxCoin2 = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 2; j++) {
                if(visited[i][j] == 0 && visited[i][j+1] == 0 && visited[i][j+2] == 0) {
                    maxCoin2 = Math.max(maxCoin2, grid[i][j] + grid[i][j + 1] + grid[i][j + 2]);
                }
            }
        }

        System.out.print(maxCoin1+maxCoin2);

        // 1x3 격자 최댓값을 구하고, 최댓값에 해당하는 인덱스를 방문 표시한다.
        // 그 후 방문된 인덱스를 제외한 상태의 1x3 격자의 최댓값을 구하는 로직으로 가자.
    }
}