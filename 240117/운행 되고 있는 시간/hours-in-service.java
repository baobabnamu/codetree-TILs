import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MIN = Integer.MIN_VALUE;
    private static final int MAX_T = 1000;

    private static int N;
    private static int[][] datas;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        datas = new int[N][N];

        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            datas[i][0] = Integer.parseInt(stk.nextToken());
            datas[i][1] = Integer.parseInt(stk.nextToken());
        }

        int ans = INT_MIN;
        for(int i = 0; i < N; i++) { // 제외할 개발자들을 순차적으로 지정
            int exceptDataIdx = i;
            int[] workingHours = new int[MAX_T];
            for(int j = 0; j < N; j++) {
                if(exceptDataIdx == j) continue;
                int startTime = datas[j][0];
                int endTime = datas[j][1];

                for(int k = startTime; k < endTime; k++) {
                    workingHours[k - 1] = 1;
                }
            }
            
            int cnt = 0;
            for(int hour : workingHours) {
                if(hour == 1) cnt++;
            }

            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);

        // 여기에 코드를 작성해주세요.
        // 전체 개발자들의 근무 시간을 마킹하되 제외할 근무자의 근무 시간은 건너 뛰기.
        // 그 후 계산된 근무시간 간 비교를 통해 최댓값 갱신.
    }
}