import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] lines = new int[2001];
        int cur = 1000;

        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            char c = stk.nextToken().charAt(0);
            if(c == 'R') {
                for(int j=cur; j<=cur+x; j++) {
                    lines[j] += 1;
                }
                cur = cur+x;
            } else {
                for(int j=cur-x; j<=cur; j++) {
                    lines[j] += 1;
                }
                cur = cur-x;
            }
        }


        int sum = 0;
        int cnt = 0;
        for(int i=0; i<lines.length-1; i++) {
            if(lines[i] >= 2) {
                cnt++;
            } else if(cnt >= 2 && lines[i] < 2) {
                sum += cnt - 1;
                cnt = 0;
            }
        }

        System.out.print(sum);
    }
}