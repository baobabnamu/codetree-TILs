import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
 
        if(a>=1) {
            for(int i=0; i<b; i++) {
                System.out.print(a);
            }
        } else {
            System.out.printf("%d", 0);
        }
    }
}