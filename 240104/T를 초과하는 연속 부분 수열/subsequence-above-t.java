import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int t = Integer.parseInt(stk.nextToken());

        // int[] nu

        stk = new StringTokenizer(br.readLine());
        int cnt = 0;
        int ans = 0;
        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(stk.nextToken());
            if(temp > t) cnt++;
            else cnt = 0;

            ans = Math.max(cnt, ans);
        }

        System.out.print(ans);
    }
}