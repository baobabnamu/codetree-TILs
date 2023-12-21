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

        // a가 제일 클 때
        // b 아니면 c 
        // 경우의 수 2가지 x 3 = 6
        if(a>b && a>c) {
            if(b<c) {
                mid = c;
            }
            else {
                mid = b;
            }
        } else if(b>a && b>c) {
            if(a<c) {
                mid = c;
            }
            else {
                mid = a;
            }
        } else if(c>b && c>a) {
            if(a<b) {
                mid = b;
            }
            else {
                mid = a;
            }
        }


        System.out.print(mid);
    }
}