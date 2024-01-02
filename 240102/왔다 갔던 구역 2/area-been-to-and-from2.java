import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] lines = new int [2001]; // lines[1000] = 0
        int cur = 1000;

        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            char c = stk.nextToken().charAt(0);
            if(c == 'R') {
                int end = cur+x;
                for(int j=cur; j<end; j++) {
                    lines[cur++] += 1;
                    // System.out.println("x : " + x + ", cur : " + cur + ", c : " + c);
                }
            } else {
                int end = cur-x;
                for(int j=cur; cur>end; j--) {
                    lines[cur--] += 1;
                    // System.out.println("x : " + x + ", cur : " + cur + ", c : " + c);
                }
            }
        }

        Arrays.sort(lines);

        int cnt = 0;
        for(int i=lines.length-1; i>=0; i--) {
            if(lines[i] >= 2) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}