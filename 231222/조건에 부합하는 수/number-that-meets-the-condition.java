import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<=a; i++) {
            if(!((i%2 == 0 && i%4 != 0) || ((i/8)%2 == 0) || (i%7 < 4))) {
                System.out.printf("%d ", i);
            }
        }
    }
}