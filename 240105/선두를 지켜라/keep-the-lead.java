import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_R = 1000000 + 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] aLog = new int[MAX_R];
        int[] bLog = new int[MAX_R];

        int aCur = 0;
        int bCur = 0;
        int aIdx = 0;
        int bIdx = 0;

        // 1. A, B 시뮬레이션을 통해 배열에 기록
        for(int i=0; i<n; i++) {
            stk = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(stk.nextToken());
            int t = Integer.parseInt(stk.nextToken());

            while(t-- > 0) {
                aCur += v;
                aLog[++aIdx] = aCur;
            }
        }

        for(int i=0; i<m; i++) {
            stk = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(stk.nextToken());
            int t = Integer.parseInt(stk.nextToken());

            while(t-- > 0) {
                bCur += v;
                bLog[++bIdx] = bCur;
            }
        }       
        
        // 2. 선두 확인
        int ans = -1;
        int[] firstLog = new int[MAX_R];
        
        for(int i=1; i<MAX_R; i++) {
            // 선두 체킹
            if(aLog[i] > bLog[i]) firstLog[i] = 1;
            else if(aLog[i] < bLog[i]) firstLog[i] = 2;
            else firstLog[i] = firstLog[i-1];

            // 선두가 이전과 다른 경우 ans++;
            if(firstLog[i] != firstLog[i-1]) ans++;
        }

        // 선두가 한 번도 바뀐 적이 없다면 초깃값
        if(ans == -1) ans = 0;

        System.out.print(ans);
    }
}