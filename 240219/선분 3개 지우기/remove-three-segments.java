import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_LINE_LEN = 101;
    private static final int MAX_N_LEN = 10;

    private static int[][] points = new int[MAX_N_LEN][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(stk.nextToken());
            points[i][1] = Integer.parseInt(stk.nextToken());
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(hasNoOverlapLine(i, j, k, n)) ans++;
                }
            }
        }
        
        System.out.print(ans);
    }

    private static boolean hasNoOverlapLine(int i, int j, int k, int n) {
        int[] line = new int[MAX_LINE_LEN];

        for(int l = 0; l < n; l++) {
            if(l == i || l == j || l == k) continue;
            for(int m = points[l][0]; m <= points[l][1]; m++) {
                line[m]++;
            }
        }

        for(int l = 0; l < MAX_LINE_LEN; l++) {
            if(line[l] > 1) return false;
        }

        return true;
    }
}