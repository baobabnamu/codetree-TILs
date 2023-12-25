import java.util.*;
import java.io.*;

public class Main {
    public static boolean hasSpecialNumbers(int n) {
        String s = Integer.toString(n);
        char[] charArr = s.toCharArray();
        for(char c : charArr) {
            if(c == '3' || c == '6' || c == '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean isMagicNumber(int n) {
        return n%3 == 0 || hasSpecialNumbers(n);
    }
    
    public static int gameNumCounting(int a, int b) {
        int cnt = 0;
        for(int i=a; i<=b; i++) {
            if(isMagicNumber(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int cnt = gameNumCounting(a, b);
        System.out.print(cnt);
    }
}