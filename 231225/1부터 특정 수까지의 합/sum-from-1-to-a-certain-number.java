import java.util.*;
import java.io.*;

public class Main {

    public static int calc(int n) {
        int sum = 0;

        for(int i=1; i<=n; i++) {
            sum += i;
        }

        return sum/10;        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = calc(n);
        System.out.print(result);
    }
}