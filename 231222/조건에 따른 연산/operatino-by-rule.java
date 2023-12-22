import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i=1; n<1000; i++) {
            cnt++;
            if(n%2 == 0) {
                n=(n*3)+1;
            } else {
                n=(n*2)+2;
            }
        }
        
        System.out.printf("%d", cnt);
    }
}