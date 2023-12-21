import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        if(n>=3000) {
            System.out.print("book");
        } else if(n>=1000) {
            System.out.print("mask");
        } else if(n>=500) {
            System.out.print("pen");
        } else {
            System.out.print("no");
        }
    }
}