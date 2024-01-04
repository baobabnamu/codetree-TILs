import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_T = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] aLog = new int[MAX_T];
        int[] bLog = new int[MAX_T];

        int aTime = 0;
        int bTime = 0;
        int aCur = 0;
        int bCur = 0;

        for(int i=0; i<n; i++) {
            stk = new StringTokenizer(br.readLine());
            char dir = stk.nextToken().charAt(0);
            int time = Integer.parseInt(stk.nextToken());

            while(time-- > 0) {
                if(dir == 'R') aLog[aTime++] = aCur++;
                else aLog[aTime++] = aCur--;
            }
        }

        for(int i=0; i<m; i++) {
            stk = new StringTokenizer(br.readLine());
            char dir = stk.nextToken().charAt(0);
            int time = Integer.parseInt(stk.nextToken());

            while(time-- > 0) {
                if(dir == 'R') bLog[bTime++] = bCur++;
                else bLog[bTime++] = bCur--;
            }
        }

        int ans = -1;
        for(int i=1; i<MAX_T; i++) {
            if(aLog[i] != 0 && aLog[i] == bLog[i]) {
                ans = i;
                break;
            }
        }

        System.out.print(ans);
    }
}