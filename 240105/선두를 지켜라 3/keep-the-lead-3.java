import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_R = 1000000;

    public static void main(String[] args) throws IOException {
        // 매시간 마다 명예의 전당이 갱신된다.
        // 명예의 전당의 조합이 달라진 경우 카운팅한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        // 1. a, b를 시뮬레이션하기 위해 배열에 입력 받는다.
        int[] aLog = new int[MAX_R + 1];
        int aCur = 0;
        int aIdx = 0;
        int aLen = 0;
        for(int i=0; i<n; i++) {
            stk = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(stk.nextToken());
            int t = Integer.parseInt(stk.nextToken());
            aLen += t;
            while(t-- > 0) {
                aCur += v;
                aLog[++aIdx] = aCur;
            }
        }

        int[] bLog = new int[MAX_R + 1];
        int bCur = 0;
        int bIdx = 0;
        int bLen = 0;
        for(int i=0; i<m; i++) {
            stk = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(stk.nextToken());
            int t = Integer.parseInt(stk.nextToken());
            bLen += t;
            while(t-- > 0) {
                bCur += v;
                bLog[++bIdx] = bCur;
            }
        }
        
        // 2. 명예의 전당 배열(인덱스:시간, 열:선두의 합계)을 만들어 집어넣는다.
        // 3. 명예의 전당 배열을 순회하면서 이전 조합과 다르다면 카운트한다.
        int len = aLen > bLen ? aLen : bLen;
        int[] hallOfFameValues = new int[len + 1]; // 1 = A, 2 = B, 3 = A, B | index = time
        int ans = 0;
        
        for(int i=1; i<=len; i++) {
            if(aLog[i] == bLog[i]) {
                hallOfFameValues[i] = 3;
            } else if(aLog[i] > bLog[i]) {
                hallOfFameValues[i] = 1;
            } else {
                hallOfFameValues[i] = 2;
            }

            if(hallOfFameValues[i-1] != hallOfFameValues[i]) ans++;
        }

        System.out.print(ans);
    }
}