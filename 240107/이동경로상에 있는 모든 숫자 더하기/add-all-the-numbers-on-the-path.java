import java.io.*;
import java.util.*;

public class Main {
    public static int n;

    public static boolean inRange(int x, int y) {
        if(x >= 0 && x < n && y >= 0 && y < n ) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        int[][] rect = new int[n][n];

        int t = Integer.parseInt(stk.nextToken());
        char[] commands = new char[t];
        commands = br.readLine().toCharArray();

        int value = 1;
        for(int i=0; i<n; i++) {
            stk = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                rect[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        // Right Down Left Up
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dirNum = 3;

        int x = n/2, y = n/2;
        int sum = rect[x][y];

        for(char command : commands) {
            if(command == 'R') dirNum = (dirNum + 1) % 4;
            else if(command == 'L') dirNum = (dirNum - 1 + 4) % 4;
            else {
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if(!inRange(nx, ny)) continue;

                x += dx[dirNum];
                y += dy[dirNum];
                sum += rect[x][y];
            }
                        
        }

        System.out.print(sum);
    }
}