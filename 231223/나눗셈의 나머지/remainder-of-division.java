import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int remainder;
        int[] cnt = new int[b];

        // counting
        while(a>=1) {
            remainder = a % b;
            cnt[remainder] += 1;
            a /= b;
        }

        // result calc
        int result = 0;
        for(int i=0; i<cnt.length; i++) {
            result += Math.pow(cnt[i], 2);
        }

        System.out.print(result);
    }
}