import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String baseStr = br.readLine();
        StringBuilder sb = new StringBuilder(br.readLine());
        int cnt = 0;
        String temp;

        for(int i=0; i<baseStr.length(); i++) {
            if(baseStr.equals(sb.toString())) {
                break;
            } else {
                cnt++;
                temp = sb.toString().charAt(sb.length()-1) + sb.toString().substring(0, sb.length()-1);
                sb.setLength(0);
                sb.append(temp);
            }
        }

        if(baseStr.equals(sb.toString())) {
            System.out.print(cnt);
        } else {
            System.out.print(-1);
        }
    }
}