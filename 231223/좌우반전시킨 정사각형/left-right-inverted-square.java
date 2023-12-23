import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int mul = 1;

        for(int i=0; i<n; i++) {
            for(int j=n; j>=1; j--) {
                System.out.printf("%d ", j*mul);
            }
            mul++;
            System.out.println();
        }
    }
}