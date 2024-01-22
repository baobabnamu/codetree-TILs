import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] startArr = new int[N + 1];
        int[] endArr = new int[N + 1];
        for (int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            startArr[i] = Integer.parseInt(stk.nextToken());
            endArr[i] = Integer.parseInt(stk.nextToken());
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            boolean overlap = true;
            for (int j = 0; j < N; j++) {
                if(i == j) continue;
                // 안 겹치는 경우의 수를 조건으로
				if ((startArr[i] < startArr[j] && endArr[i] > endArr[j]) || startArr[i] > startArr[j] && endArr[i] < endArr[j]) {
					overlap = false;
					break;
				}
            }
            if(overlap) ans++;
        }

        System.out.println(ans);
    }

}