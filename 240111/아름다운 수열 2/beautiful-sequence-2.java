import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int[] A = new int[N];
        int[] B = new int[M];

        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) 
            A[i] = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) 
            B[i] = Integer.parseInt(stk.nextToken());

        // 핵심 아이디어 : 수열 B와 파트 수열 P의 길이를 동일하게 한 뒤 각각 정렬 후 비교한다.

        // B 수열 정렬
        Arrays.sort(B);

        int ans = 0;
        int[] P = new int[100];
        for(int i = 0; i <= N - M; i++) {
            for(int j = 0; j < M; j++) {
                P[j] = A[i + j];
            }

            // P 수열 정렬
            Arrays.sort(P, 0, M);

            boolean isExist = true;
            for(int j = 0; j < M; j++) {
                if(P[j] != B[j]) {
                    isExist = false;
                }
            }

            if(isExist) {
                ans++;
            }
        }

        System.out.print(ans);
    }
}