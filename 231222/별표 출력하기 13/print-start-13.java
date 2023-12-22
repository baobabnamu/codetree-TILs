import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        // 윗단
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();

            for(int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}