import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_L = 1000;

    private static int[] line = new int[MAX_L + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(stk.nextToken());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        for(int i = 0; i < T; i++) {
            stk = new StringTokenizer(br.readLine());
            String alphabet = stk.nextToken();
            int index = Integer.parseInt(stk.nextToken());

            line[index] = alphabet.equals("S") ? 1 : 2;
        }

        int ans = 0;
        for(int i = a; i <= b; i++) {
            int d1 = calcDistance(i, 1);
            int d2 = calcDistance(i, 2);

            if(d1 <= d2) ans++;
        }

        System.out.print(ans);
    }

    private static boolean inRange(int x) {
        return (x > 0 && x <= MAX_L);
    }

    private static int calcDistance(int x, int alphabetType) {
        int distance = 0;
        
        if(line[x] == alphabetType) return distance;

        boolean isFind = false;
        while(!isFind) {
            distance++;

            int leftCur = x - distance;
            if(inRange(leftCur)) {
                if(line[leftCur] == alphabetType) {
                    isFind = true;
                }
            }

            int rightCur = x + distance;
            if(inRange(rightCur)) {
                if(line[rightCur] == alphabetType) {
                    isFind = true;
                }
            }
        }

        return distance;
    }
}