import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<n; i++) {
            for(int j=1; j<=n-i; j++) {
                if(j>=n-i) {
                    System.out.printf("%d * %d = %d ", i+1, j, (i+1)*j);
                } else {
                    System.out.printf("%d * %d = %d / ", i+1, j, (i+1)*j);
                }
            }
            System.out.println();
        }
    }
}