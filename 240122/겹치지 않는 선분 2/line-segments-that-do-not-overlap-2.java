import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_N = 100;
    private static final int OFFSET = 1000000;
    private static final int MAX_X = OFFSET * 2;

    private static int N;
    private static int[] lines = new int[MAX_X + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[][] lineInfos = new int[N][N];

        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            lineInfos[i][0] = Integer.parseInt(stk.nextToken()); // start
            lineInfos[i][1] = Integer.parseInt(stk.nextToken()); // end
        }  

        int ans = 0;
        for(int i = 0; i < N; i++) {
            int[] firstSelected = lineInfos[i];
            boolean isOverlap = false;

            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                int[] secondSelected = lineInfos[j];
                if(checkOverlap(firstSelected, secondSelected)) {
                    isOverlap = true;
                    break;
                }
            }

            if(isOverlap) ans++;
        }
        
        System.out.print(ans/2);
        // 선분 하나씩 지정
        // 다른 선분과 완탐 비교하면서 만약 겹친다면 flag true로 바꾸고 break
        // flag false인 경우에만 카운팅
    }

    private static boolean checkOverlap(int[] info1, int[] info2) {
        int start1 = info1[0] + OFFSET, start2 = info2[0] + OFFSET;
        int end1 = info1[1] + OFFSET, end2 = info2[1] + OFFSET;

        for(int i = start1; i <= end1; i++)
            lines[i]++;

        for(int i = start2; i <= end2; i++)
            lines[i]++;

        int start = Math.min(start1, start2);
        int end = Math.max(end1, end2);

        for(int i = start; i <= end; i++) {
            if(lines[i] >= 2) {
                return true;
            }
            lines[i] = 0; // initialize
        }

        return false;
    }
}