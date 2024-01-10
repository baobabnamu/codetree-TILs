import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken()) + 1; // 사진의 크기는 x 값끼리의 차 -> 예시) 0, 6 -> 0, 1, 2, 3, 4, 5, 6인 총 7개 좌표 탐색

        int[] locations = new int[N];
        int[] alphabets = new int[N];

        int len = 0;
        for(int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            locations[i] = Integer.parseInt(stk.nextToken());
            char alphabet = stk.nextToken().charAt(0);
            alphabets[i] = alphabet == 'G' ? 1 : 2;
            len = Math.max(len, locations[i]);
        }

        int[] lines = new int[len];
        for(int i = 0; i < locations.length; i++)
            lines[locations[i] - 1] = alphabets[i];

        int max = INT_MIN;
        for(int i = 0; i <= len - K; i++) {
            int sum = 0;
            for(int j = i; j < i + K; j++) {
                sum += lines[j];
            }
            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}