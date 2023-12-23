import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int maxStrLen = 0;
        int minStrLen = 21;

        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            sb.setLength(0);
            sb.append(st.nextToken());
            maxStrLen = Math.max(sb.length(), maxStrLen);
            minStrLen = Math.min(sb.length(), minStrLen);
        }

        System.out.print(maxStrLen-minStrLen);
    }
}