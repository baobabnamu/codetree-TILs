import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cows = new int[n];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            cows[i] = Integer.parseInt(stk.nextToken());

        int cnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    if(i < j && j < k && cows[i] < cows[j] && cows[j] < cows[k]) {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}