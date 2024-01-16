import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_N = 10;
    private static int n = MAX_N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] diceNums = new int[6];

        for(int i = 0; i < 10; i++) {
            int diceNum = Integer.parseInt(stk.nextToken()) - 1;
            diceNums[diceNum]++;
        }

        for(int i = 0; i < diceNums.length; i++) {
            System.out.printf("%d - %d\n", i + 1, diceNums[i]);
        }
    }
}