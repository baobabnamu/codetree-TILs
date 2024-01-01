import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] lines = new int[201];

        // 구간 칠하기
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 100(offset) 더하기
            int start = Integer.parseInt(st.nextToken()) + 100;
            int end = Integer.parseInt(st.nextToken()) + 100; 

            for(int j=start; j<end; j++) {
                lines[j] += 1;
            }
        }

        // 최댓값 = 겹치는 선분의 최대 개수
        Arrays.sort(lines);

        System.out.print(lines[lines.length - 1]);
    }
}