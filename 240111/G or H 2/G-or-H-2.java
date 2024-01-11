import java.io.*;
import java.util.*;

public class Main {
    private static int MAX_L = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] line = new int[MAX_L + 1];

        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(stk.nextToken());
            line[idx] = stk.nextToken().charAt(0) == 'G' ? 1 : 2;
        }

        int ans = 0;
        for(int i = 0; i <= MAX_L; i++) {
            if(line[i] == 0) continue;
            int G = 0, H = 0;

            for(int j = i; j <= MAX_L; j++) {
                if(line[j] == 0) continue;
                else if(line[j] == 1) G++;
                else if(line[j] == 2) H++;

                if(G == 0 || H == 0 || G == H)
                    ans = Math.max(ans, Math.abs(i - j));
            }
        }

        System.out.print(ans);
    }
}