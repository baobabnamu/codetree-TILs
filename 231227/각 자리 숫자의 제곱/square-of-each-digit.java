import java.util.*;
import java.io.*;

public class Main {
    public static int calc(int n) {
        if(n < 10) {
            return n*n;
        }

        return calc(n / 10) + calc(n % 10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(calc(n));
    }
}