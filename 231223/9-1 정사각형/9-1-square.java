import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = 9;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(k<1) {
                    k = 9;
                }
                System.out.print(k--);
            }
            System.out.println();
        }
    }
}