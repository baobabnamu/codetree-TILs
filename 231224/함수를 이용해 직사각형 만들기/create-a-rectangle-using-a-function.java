import java.io.*;
import java.util.*;

public class Main {
    public static void print1Rect(int n, int m) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        print1Rect(n, m);
    }
}