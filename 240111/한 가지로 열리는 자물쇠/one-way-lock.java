import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int digit1 = Integer.parseInt(stk.nextToken());
        int digit2 = Integer.parseInt(stk.nextToken());
        int digit3 = Integer.parseInt(stk.nextToken());

        int cnt = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                for(int k = 1; k <= N; k++) {
                    if(check(digit1, i) || check(digit2, j) || check(digit3, k)) {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }

    private static boolean check(int baseDigit, int compareDigit) {
        if(Math.abs(baseDigit - compareDigit) <= 2) return true;
        return false;
    }
}