import java.io.*;
import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        // n개의 집이 1 ~ n까지 순서대로 놓여있음.
        // 각각 A 명의 사람이 살고 있음.
        // n 개의 집 중 한 곳에 모으려고 하는데 적절한 집을 선택하여 모든 사람들의 이동 거리의 합이 최소가 되도록 하는 로직.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] homes = new int[n];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            homes[i] = Integer.parseInt(stk.nextToken());

        // 1번째 집 모이는 경우 : 1 * 0 + 2 * 1 + 3 * 2 + 2 * 3 + 4 * 6
        int minSum = INT_MAX;
        for(int i=0; i<n; i++) {
            int base = homes[i];
            int sum = 0;
            for(int j=0; j<n; j++) {
                sum += homes[j] * Math.abs(j - i);
            }
            minSum = Math.min(minSum, sum);
        }
        
        System.out.print(minSum);
    }
}