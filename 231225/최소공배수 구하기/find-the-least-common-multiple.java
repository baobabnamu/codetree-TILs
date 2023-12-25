import java.util.*;
import java.io.*;

public class Main {

    public static int calcGCD(int n, int m) {
        // gcd = gcd(n, n%m);
        while(m != 0) {
            int temp = m;
            m = n%m;
            n = temp;
        }
        return Math.abs(n);
    }

    public static void calcLCM(int n, int m) {
        int gcd = calcGCD(n, m);
        int lcm = Math.abs(n*m)/gcd;
        System.out.print(lcm);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        calcLCM(n, m);
    }
}