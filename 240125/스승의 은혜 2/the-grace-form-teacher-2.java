import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_N = 1000;

    private static int N, B;
    private static int[] P = new int[MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        B = Integer.parseInt(stk.nextToken());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(P, 0, N);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            int budget = B;
            for (int j = 0; j < N; j++) {
                int price = (j == i) ? P[j] / 2 : P[j]; // j == i 인 경우 최대 가격으로 가정하고 계산
                if (budget >= price) {
                    budget -= price;
                    cnt++;
                }
            }
            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}