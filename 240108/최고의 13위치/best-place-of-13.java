import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] rect = new int[n][n];

        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                rect[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int ans = 0;
        int offset = n - 3;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n - 2; j++) {
                int cnt = 0;
                if(rect[i][j] == 1) cnt++;
                if(rect[i][j+1] == 1) cnt++;
                if(rect[i][j+2] == 1) cnt++;
                ans = Math.max(cnt, ans);
            }
        }

        System.out.print(ans);
    }
}