import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] digits = new int[18];
        int cnt = 0;

        while(true) {
            if(n < 2) {
                digits[cnt++] = n;
                break;
            }

            digits[cnt++] = n % 2;
            n /= 2;
        }

        for(int i=cnt-1; i>=0; i--) {
            System.out.printf("%d", digits[i]);
        }
    }
}