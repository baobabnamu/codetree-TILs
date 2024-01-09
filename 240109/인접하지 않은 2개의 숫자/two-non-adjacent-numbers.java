import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) 
            nums[i] = Integer.parseInt(stk.nextToken());

        int max = 0;
        for(int i = 0; i < n; i++) {
            int baseNum = nums[i];
            for(int j = 0; j < n; j++) {
                if(Math.abs(i - j) <= 1) continue;
                max = Math.max(max, nums[i] + nums[j]);
            }
        }

        System.out.print(max);
        // 인접하지 않은 숫자 2개를 각각 골라 합을 구하는 것.
        // 외부 for : 어떤 숫자를 기준으로 인접을 구분할 것인지.
        // 내부 for : 어떤 숫자와 조합을 할 것인지. + max 값 갱신
    }
}