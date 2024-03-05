import java.util.*;

public class Main {

    private static int n, m;
    private static int[] numsA, numsB;

    public static void main(String[] args) {
        // 1이상 n이하의 숫자로만 이루어진 (a, b) 숫자 쌍이 총 m번 주어질 때 가장 많이 나오 숫자 쌍의 수를 세는 프로그램을 작성하여라.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        numsA = new int[m];
        numsB = new int[m];

        // 1. 숫자쌍 입력받기
        for(int i = 0; i < m; i++) {
            numsA[i] = sc.nextInt();
            numsB[i] = sc.nextInt();
        }

        // 2. 숫자쌍 완탐
            // 1) 숫자 i : 1 ~ n 돌리는 반복문
                // 2) 숫자 j : i + 1 ~ n 돌리는 반복문
                    // 3) 입력받은 숫자쌍 완탐
                        // 만약 (i == a && j == b) || (i == b && j == a) 인 경우 overlapCnt++
                // overlapCnt, ans 중 더 큰 값으로 갱신
        int ans = 0;
        for(int i = 1; i <= n ; i++) {
            for(int j = i + 1; j <= n; j++) {
                int overlapCnt = 0;
                for(int k = 0; k < m; k++) {
                    int a = numsA[k];
                    int b = numsB[k];
                    // System.out.println("a : " + a + ", b : " + b + ", i : " + i + ", j : " + j);
                    if(((i == a) && (j == b)) || ((j == a) && (i == b))) {
                        overlapCnt++;
                    }
                }
                ans = Math.max(ans, overlapCnt);
            }
        }

        System.out.print(ans);
    }
}