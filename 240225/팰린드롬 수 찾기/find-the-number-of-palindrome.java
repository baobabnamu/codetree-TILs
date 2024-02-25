import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(stk.nextToken());
        int end = Integer.parseInt(stk.nextToken());

        int ans = 0;
        for(int i = start; i <= end; i++) {
            if(isSpecialNumber(i)) {
                ans++;
            }
        }

        System.out.print(ans);
    }

    private static boolean isSpecialNumber(int number) {
        // 팰린드롬 수 검증
        String base = Integer.toString(number);
        char[] chars = base.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for(int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        String compare = sb.toString();

        return base.equals(compare);
    }
}