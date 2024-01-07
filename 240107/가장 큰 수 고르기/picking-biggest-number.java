import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int max = 0;
        while(stk.hasMoreTokens()) {
            max = Math.max(max, Integer.parseInt(stk.nextToken()));
        }

        System.out.print(max);
    }
}