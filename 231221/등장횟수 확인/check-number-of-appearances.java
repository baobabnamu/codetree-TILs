import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int temp;
        int cnt = 0;
        
        for(int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            temp = Integer.parseInt(st.nextToken());
            if(temp%2==0) {
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}