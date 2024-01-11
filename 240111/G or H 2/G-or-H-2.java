import java.io.*;
import java.util.*;

public class Main {
    private static int MAX_L = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] lines = new int[MAX_L + 1];

        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(stk.nextToken());
            lines[idx] = stk.nextToken().charAt(0) == 'G' ? 1 : 2; // G : 1, H : 2
        }

        int max = 0;
        for(int i = 0; i <= MAX_L; i++) {
            if(lines[i] == 0) continue;
            int hCnt = 0, gCnt = 0;

            for(int j = i; j <= MAX_L; j++) {
                if(lines[j] == 0) continue;
                else if(lines[j] == 1) gCnt++;
                else if(lines[j] == 2) hCnt++;

                if(gCnt == 0 || hCnt == 0 || gCnt == hCnt)
                    max = Math.max(max, Math.abs(i - j));
            }
        }

        System.out.print(max);
    }
}