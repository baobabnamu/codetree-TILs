import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = 0;

        for(int i=0; i<n; i++) {
            if(i%2 == 0) {
                for(int j=0; j<n; j++) {
                    k+=1;
                    System.out.printf("%d ", k);
                }
            } else {
                for(int j=0; j<n; j++) {
                    k+=2;
                    System.out.printf("%d ", k);
                }
            }
            System.out.println();
        }
        
    }
}