import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_N = 100;

    private static int[] boombs = new int[MAX_N];
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        for(int i = 0; i < n; i++) {
            boombs[i] = Integer.parseInt(br.readLine());
        }

        int max = -1;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= k; j++) {                
                if(inRange(i - j)) {
                    if(boombs[i] == boombs[i - j]) {
                        max = Math.max(max, boombs[i]);
                    }
                } else if (inRange(i + j)) {
                    if(boombs[i] == boombs[i + j]) {
                        max = Math.max(max, boombs[i]);
                    }
                }
            }
        }

        System.out.print(max);
    }

    protected static boolean inRange(int compareIdx) {
        return compareIdx >= 0 && compareIdx < n;
    }
}