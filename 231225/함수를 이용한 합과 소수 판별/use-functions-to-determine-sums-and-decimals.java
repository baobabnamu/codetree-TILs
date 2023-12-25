import java.util.*;
import java.io.*;

public class Main {
    public static boolean isSpecicalEvenNumber(int n) {
        String s = Integer.toString(n);
        char[] numbers = s.toCharArray();
        int result = 0;

        for(char number : numbers) {
            result += number;
        }

        if(result % 2 == 0) {
            return true;
        }

        return false;

    }

    public static boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMagicNumber(int n) {
        return isPrime(n) && isSpecicalEvenNumber(n);
    }
    
    public static int countingSpecialNumbers(int a, int b) {
        int result = 0;
        for(int i=a; i<=b; i++) {
            if(isMagicNumber(i)) {
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

        int cnt = countingSpecialNumbers(a, b);
        System.out.print(cnt);
    }
}