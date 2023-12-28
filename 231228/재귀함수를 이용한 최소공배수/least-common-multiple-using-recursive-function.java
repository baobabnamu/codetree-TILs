import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr;

    public static int calcGCD(int n, int m) {
        while(m != 0) {
            int temp = m;
            m = n%m;
            n = temp;
        }
        return Math.abs(n);
    }

    public static int calcLCM(int n, int m) {
        int gcd = calcGCD(n, m);
        int lcm = Math.abs(n*m)/gcd;
        return lcm;
    }

    public static int magicCalc(int idx, int lcm) {
        if(idx < 0) {
            return lcm;
        }

        lcm = calcLCM(arr[idx], lcm);
        return magicCalc(idx - 1, lcm);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }

        System.out.print(magicCalc(n-1, 1));
    }
}