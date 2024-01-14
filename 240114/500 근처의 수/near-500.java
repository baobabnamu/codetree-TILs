import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int max500Under = 0;
        int min500Over = 1001;
        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(stk.nextToken());
            if(n < 500) {
                max500Under = Math.max(max500Under, n);
            } else {
                min500Over = Math.min(min500Over, n);
            }
        }

        System.out.printf("%d %d", max500Under, min500Over);
    }
}