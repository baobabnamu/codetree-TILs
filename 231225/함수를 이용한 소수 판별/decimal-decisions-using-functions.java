import java.util.*;
import java.io.*;

public class Main {
    public static boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calcSum(int a, int b) {
        int sum = 0;
        for(int i=2; i<=b; i++) {
            if(isPrime(i)) {
                sum += i;
            } 
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = calcSum(a, b);
        System.out.print(sum);
    }
}