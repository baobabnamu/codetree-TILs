import java.util.*;
import java.io.*;

public class Main {
    public static boolean isOnjeonNumber(int n) {
        String numberStr = Integer.toString(n);
        char numberLastChar = numberStr.charAt(numberStr.length()-1);
        if(n%2 == 0) {
            return false;
        }
        if(numberLastChar == '5') {
            return false;
        }
        if(n%3==0 && n%9 != 0) {
            return false;
        }

        return true;
    }

    public static int countingOnjeonNumber(int a, int b) {
        int result = 0;
        for(int i=a; i<=b; i++) {
            if(isOnjeonNumber(i)) {
               result++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = countingOnjeonNumber(a, b);
        System.out.print(cnt);
    }
}