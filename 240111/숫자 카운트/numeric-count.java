import java.io.*;
import java.util.*;

public class Main {
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] strikes = new int[N];
        int[] balls = new int[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(stk.nextToken());
            strikes[i] = Integer.parseInt(stk.nextToken());
            balls[i] = Integer.parseInt(stk.nextToken());
        }

        // 입력 받은 값과 ball, strike가 동일한 경우가 '유추'할 수 있는 유일한 경우의 수임.
        int ans = 0;
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                for(int k = 1; k <= 9; k++) {
                    if(i == j && j == k && i == k) continue;

                    boolean isSuccessed = true;
                    for(int m = 0; m < N; m++) {
                        int strike = 0, ball = 0;

                        int num100 = nums[m] / 100;
                        int num10 = (nums[m] / 10) % 10;
                        int num1 = nums[m] % 10;

                        if(i == num100) strike++;
                        if(j == num10) strike++;
                        if(k == num1) strike++;

                        if(num100 == j || num100 == k) ball++;
                        if(num10 == i || num10 == k) ball++;
                        if(num1 == i || num1 == j) ball++;

                        if(strike != strikes[m] || ball != balls[m]) {
                            isSuccessed = false;
                            break;
                        }
                    }

                    if(isSuccessed) ans++;
                }
            }
        }

        System.out.print(ans);
    }
}