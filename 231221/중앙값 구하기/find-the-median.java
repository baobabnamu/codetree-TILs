import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int mid = 0;

        if(a>b) {
            if(a<c) {
                mid = a;
            }
        } else if (b>a) {
            if(b<c) {
                mid = b;
            }
        } else if (c>a) {
            if(c<b) {
                mid = c;
            }
        }


        System.out.print(mid);
    }
}