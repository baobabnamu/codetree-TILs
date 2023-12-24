import java.io.*;
import java.util.*;

public class Main {

    public static void gcd(int n, int m) {
        int result = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0 && m%i == 0) {
                result = i;
            }
        }

        System.out.print(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        gcd(n, m);
    }
}