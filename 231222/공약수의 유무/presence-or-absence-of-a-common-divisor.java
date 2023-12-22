import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean flag = false;
        
        for(int i=a; i<=b; i++) {
            if(1920%i == 0 && 2880%i == 0) {
                flag = true;
            } 
            if(flag) {
                System.out.print("1");
                break;
            }
        }
        if(!flag) {
            System.out.print("0");
        }
    }
}