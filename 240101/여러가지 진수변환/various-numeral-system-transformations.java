import java.util.*;
import java.io.*;

public class Main {
    public static String convertNumber(int num, int radix) {
        int cnt = 0;
        int[] digits = new int[10];

        while(true) {
            if(num < radix) {
                digits[cnt++] = num;
                break;
            }

            digits[cnt++] = num % radix;
            num /= radix;
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
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.print(convertNumber(n, b));
    }
}