import java.io.*;
import java.util.*;

public class Main {
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        int[] strikes = new int [N];
        int[] balls = new int [N];
        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(stk.nextToken());
            strikes[i] = Integer.parseInt(stk.nextToken());
            balls[i] = Integer.parseInt(stk.nextToken());
        }

        int ans = 0;
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                for(int k = 1; k <= 9; k++) {
                    if(i == j || i == k || j == k) continue;

                    boolean isSuccessed = false;
                    for(int m = 0; m < N; m++) {
                        int strike = 0, ball = 0;
                        int num100 = nums[m] / 100;
                        int num10 = (nums[m] / 10) % 10;
                        int num1 = nums[m] % 10;

                        if(num100 == i) strike++;
                        if(num10 == j) strike++;
                        if(num1 == k) strike++;

                        if(num100 == j || num100 == k) ball++;
                        if(num10 == i || num10 == k) ball++;
                        if(num1 == i || num1 == j) ball++;

                        if(strikes[m] == strike && balls[m] == ball) {
                            isSuccessed = true;
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