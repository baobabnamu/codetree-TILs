import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int x = 0, y = 0;

        int ans = 0;
        int dirNum = 0;
        boolean isFind = false;
        while(n-- > 0) {
            if(isFind) break;

            StringTokenizer stk = new StringTokenizer(br.readLine());
            char dir = stk.nextToken().charAt(0);
            int move = Integer.parseInt(stk.nextToken());

            if(dir == 'E') dirNum = 0;
            else if(dir == 'S') dirNum = 1;
            else if(dir == 'W') dirNum = 2;
            else if(dir == 'N') dirNum = 3;

            for(int i=0; i<move; i++) {
                x += dx[dirNum];
                y += dy[dirNum];
                ans++;
                if(x == 0 && y == 0) {
                    System.out.printf("%d", ans);
                    isFind = true;
                    break;
                } 
            }
        }

        if(!isFind) System.out.print("-1");
    }
}