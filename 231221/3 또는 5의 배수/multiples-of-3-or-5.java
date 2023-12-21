import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        
        if(a%3==0) {
            System.out.print("YES\n");
        } else {
            System.out.print("NO\n");
        }

        if(a%5==0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        
    }
}