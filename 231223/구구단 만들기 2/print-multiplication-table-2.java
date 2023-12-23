import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int j=2; j<=8; j=j+2) {
            for(int i=b; i>=a; i--) {
                if(i==a) {
                System.out.printf("%d * %d = %d ", i, j, i*j);    
                } else {
                System.out.printf("%d * %d = %d / ", i, j, i*j);
                }
            }
            System.out.println();
        }
    }
}