import java.io.*;
import java.util.*;

public class Main {
    private static int MAX_L = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());

        int[] line = new int[MAX_L + 1];
        for(int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(stk.nextToken());
            int location = Integer.parseInt(stk.nextToken());
            line[location] += candy; // 같은 위치에 여러 바구니
        }
        
        // 핵심 아이디어 : 구간 별로 Array 분할하고, 분할한 Array 별로 sum 값을 구한다음 max 갱신
        int maxSum = 0;
        for(int c = 0; c <= MAX_L; c++) {
            int start = c - K;
            int end = c + K;
            int sum = 0;

            for(int i = start; i <= end; i++) { // 중심점의 범위는 K <= c <= c+K
                if(i >= 0 && i <= MAX_L) { // 단 인덱스 범위 초과 고려
                    sum += line[i];
                }
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.print(maxSum);
    }
}