import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_R = 1000000;

    public static void main(String[] args) throws IOException {
        // 로봇 A와 B의 위치가 바로 직전에는 다른 위치에 있다가 그 다음번에 같은 위치에 오게되는 경우의 수
        // 주의 : 바로 직전에 같은 위치에 있었다면 경우의 수로 포함하지 않음.
        // 주의 : 원점을 기준으로 시작하며 이는 횟수에 포함하지 않음. 이후, 원점에서 다시 이동하는 게 아니라 마지막 위치를 기준으로 이동함.
        // 주의 : 로봇의 총 합 거리는 100만 이하임.
        // 주의 : 로봇 간 이동 시간이 다를 수 있으며, 어떠한 로봇이 멈췄다고 해서 다른 로봇이 멈추는 건 아님.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        // 1. A, B 기록
        int[] aLog = new int[MAX_R];
        int aIdx = 0;

        for(int i=0; i<n; i++) {
            stk = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(stk.nextToken());
            char d = stk.nextToken().charAt(0);

            while(t-- > 0) {
                if(d == 'L') {
                    aLog[++aIdx] = aLog[aIdx-1] - 1;
                } else {
                    aLog[++aIdx] = aLog[aIdx-1] + 1;
                }
            }
        }

        // 주의 : 로봇이 멈춘 경우, 그 뒤에 모든 위치는 마지막 로봇 위치.
        for(int i=aIdx; i<1000; i++) aLog[i] = aLog[aIdx]; 

        int[] bLog = new int[MAX_R];
        int bIdx = 0;

        for(int i=0; i<m; i++) {
            stk = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(stk.nextToken());
            char d = stk.nextToken().charAt(0);

            while(t-- > 0) {
                if(d == 'L') {
                    bLog[++bIdx] = bLog[bIdx-1] - 1;
                } else {
                    bLog[++bIdx] = bLog[bIdx-1] + 1;
                }
            }
        }

        // 주의 : 마지막 로봇 위치로 변경
        for(int i=bIdx; i<MAX_R; i++) bLog[i] = bLog[bIdx]; 

        // 2. A, B 순회하면서 조건에 맞는 경우의 수 카운팅
        // 조건 : A-1 != B-1 && A == B
        int ans = 0;
        for(int i=1; i<MAX_R; i++) {
            if(aLog[i-1] != bLog[i-1] && aLog[i] == bLog[i]) {
                ans++;
            }
        }

        System.out.print(ans);
    }
}