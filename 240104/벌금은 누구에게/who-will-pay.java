import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1~N : 학생 수, K : 벌금 임계값(이상), M : 벌칙에 걸린 학생 번호 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        int[] students = new int[n + 1];
        int idx = 0;

        int ans = -1;
        for(int i=0; i<m; i++) {
            int penaltyStudentNumber = Integer.parseInt(br.readLine());
            students[penaltyStudentNumber]++;

            if(students[penaltyStudentNumber] >= k)
                ans = penaltyStudentNumber;
        }
        System.out.print(ans);
    }
}