import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();
        int n = 0;
        int[] digits = new int[10];
        int cnt = 0;

        for(int i=0; i<binary.length(); i++) {
            n = n * 2 + Integer.parseInt(binary.substring(i, i+1));
        }

        n *= 17;

        while(true) {
            if(n < 2) {
                digits[cnt++] = n;
                break;
            }

            digits[cnt++] = n % 2;
            n /= 2;
        }

        for(int i=cnt-1; i>=0; i--) {
            System.out.print(digits[i]);
        }
    }
}