import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int H = Integer.parseInt(stk.nextToken());
        int T = Integer.parseInt(stk.nextToken());
        int[] place = new int[N];

        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            place[i] = Integer.parseInt(stk.nextToken());
        }

        // N개의 밭 높이가 주어지면 H 높이로 T번 연속하게 나오게 하고 싶음.
        // 최소 비용

        // T 구간만큼 잘라서 반복
        int min = INT_MAX;
        for(int i = 0; i <= N - T; i++) {
            int cost = 0;

            for(int j = i; j < i + T; j++) {
                cost += calcCost(place[j], H);
            }
            min = Math.min(min, cost);
        }

        System.out.print(min);
    }

    private static int calcCost(int number, int goal) {
        int cost = 0;        

        while(number != goal) {
            if(number > goal) number--;
            else number++;
            cost++;
        }

        return cost;
    }
}