import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_R = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        int x = 0;
        int y = 0;

        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            char dir = stk.nextToken().charAt(0);
            int move = Integer.parseInt(stk.nextToken());

            for(int j=0; j<move; j++) {
                if(dir == 'W') x += dx[0];
                else if(dir == 'S') y += dy[1];
                else if(dir == 'N') y += dy[2];
                else if(dir == 'E') x += dx[3];
            }

        }

        System.out.printf("%d %d", x, y);
    }
}