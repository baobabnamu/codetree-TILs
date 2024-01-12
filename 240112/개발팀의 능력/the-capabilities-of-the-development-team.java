import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int MAX_N = 5;

    private static int n = MAX_N;
    private static int[] persons = new int[MAX_N];
    private static int totalSum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            persons[i] = Integer.parseInt(stk.nextToken());
            totalSum += persons[i];
        }

        int ans = INT_MAX;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(i == j || i == k || j == k) continue;
                    ans = Math.min(ans, diff(i, j, k));
                }
            }
        }

        if(ans == 100) ans = -1;
        System.out.print(ans);
    }

    private static int diff(int i, int j, int k) {
        int sum1 = persons[i];
        int sum2 = persons[j] + persons[k];
        int sum3 = totalSum - (sum2 + sum1);

        if(sum1 != sum2 && sum1 != sum3 && sum2 != sum3) 
            return Math.max(Math.max(sum1, sum2), sum3) - Math.min(Math.min(sum1, sum2), sum3);

        return 100;
    }
}