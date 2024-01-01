import java.util.*;
import java.io.*;

public class Main {
    public static String swapCastingCode(int orgRadix, int castRadix, String code) {
        // orgRadix, code -> 10진수 변환
        int num = 0;
        for(int i=0; i<code.length(); i++) {
            num = orgRadix * num + Integer.parseInt(code.substring(i, i+1));
        }

        // 10진수 -> castRadix 변환
        int[] digits = new int[100];
        int cnt = 0;
        while(true) {
            if(num < castRadix) {
                digits[cnt++] = num;
                break;
            }

            digits[cnt++] = num % castRadix;
            num /= castRadix;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=cnt-1; i>=0; i--) {
            sb.append(digits[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String code = br.readLine();

        System.out.print(swapCastingCode(a, b, code));
    }
}