import java.util.*;
import java.io.*;

public class Main {
    public static int recursive(int depth, int n) {
        if(n <= 1) {
            return depth;
        }

        if(n % 2 == 0) {
            return recursive(depth+1, n/2);
        } else {
            return recursive(depth+1, n/3);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(recursive(0, n));
    }
}