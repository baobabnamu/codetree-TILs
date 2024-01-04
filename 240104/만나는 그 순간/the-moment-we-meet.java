import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] aTimes = new int[n];
        char[] aDirections = new char[n];
        int[] bTimes = new int[m];
        char[] bDirections = new char[m];
        int aTotalTime = 0;
        int bTotalTime = 0;

        // 1. a랑 b의 총 소요 시간 구하기
        for(int i=0; i<n; i++) {
            stk = new StringTokenizer(br.readLine());
            aDirections[i] = stk.nextToken().charAt(0);
            aTimes[i] = Integer.parseInt(stk.nextToken());
            aTotalTime += aTimes[i];
        }

        for(int i=0; i<m; i++) {
            stk = new StringTokenizer(br.readLine());
            bDirections[i] = stk.nextToken().charAt(0);
            bTimes[i] = Integer.parseInt(stk.nextToken());
            bTotalTime += bTimes[i];
        }
    
        // 2. 둘 중 더 큰 소요 시간으로 배열 생성
        int len = aTotalTime > bTotalTime ? aTotalTime : bTotalTime;

        int[] aLogs = new int[len + 1];
        int[] bLogs = new int[len + 1];
        
        // 3. 배열 입력 받기
        int aCur = 0;
        int aValue = 0;
        int bCur = 0;
        int bValue = 0;

        for(int i=0; i<n; i++) {
            int limit = aCur + aTimes[i];
            char dir = aDirections[i];
            
            for(int j=aCur+1; j<=limit; j++) {
                if(dir == 'R') {
                    aLogs[j] = ++aValue;
                } else {
                    aLogs[j] = --aValue;
                }
            }

            aCur += aTimes[i];
        }

        for(int i=0; i<m; i++) {
            int limit = bCur + bTimes[i];
            char dir = bDirections[i];
            
            for(int j=bCur+1; j<=limit; j++) {
                if(dir == 'R') {
                    bLogs[j] = ++bValue;
                } else {
                    bLogs[j] = --bValue;
                }
            }

            bCur += bTimes[i];
        }

        // 4. 동시에 배열 인덱스 순회하면서 만나는 인덱스가 곧 정답
        // index는 초, value는 현재 A(혹은 B)의 위치
        boolean isMeet = false;
        for(int i=1; i<len + 1; i++) {
            if(aLogs[i] == bLogs[i]) {
                isMeet = true;
                System.out.print(i);
                break;
            }
        }

        if(!isMeet) System.out.print("-1");
    }
}