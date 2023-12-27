import java.util.*;
import java.io.*;

public class Main {
    public static int magicCalc(int n) {
        if(n==1) {
            return 1;
        }

        if(n==2) {
            return 2;
        }

        return n + magicCalc(n-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        System.out.print(magicCalc(n));
    }
}