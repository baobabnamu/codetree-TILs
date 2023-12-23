import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        // 아이디어 : 아스키 코드 순회 활용 -> 'A' 65, 'Z' 90
        int ascii = 65;
        for(int i=0; i<n; i++) {
            if(i>=1) {
                for(int j=1; j<=i; j++) {
                    System.out.print("  ");
                }
            }
            for(int j=i; j<n; j++) {
                if(ascii>90) {
                    ascii = 65;
                }
                System.out.printf("%c ", (char)ascii++);
            }
            System.out.println();
        }
    }
}