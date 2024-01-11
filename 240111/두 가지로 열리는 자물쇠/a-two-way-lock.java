import java.io.*;
import java.util.*;

public class Main {
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(stk.nextToken());
        int b1 = Integer.parseInt(stk.nextToken());
        int c1 = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(stk.nextToken());
        int b2 = Integer.parseInt(stk.nextToken());
        int c2 = Integer.parseInt(stk.nextToken());

        int cnt = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                for(int k = 1; k <= N; k++) {
                    if(checkOpen(i, j, k, a1, b1, c1) || checkOpen(i, j, k, a2, b2, c2))
                        cnt++;
                }
            }
        }

        System.out.print(cnt);
    }

    private static boolean checkOpen(int i, int j, int k, int digit1, int digit2, int digit3) {
        if(checkDigit(i, digit1) && checkDigit(j, digit2) && checkDigit(k, digit3)) return true;
        return false;
    }

    private static boolean checkDigit(int number, int digit) {
        if(Math.abs(digit - number) <= 2 || Math.abs(digit - number) >= N - 2) return true;
        return false;
    }
}