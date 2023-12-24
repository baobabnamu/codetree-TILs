import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<2; i++) {
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                sb.append(st.nextToken());
            }
        }
        System.out.print(sb.toString());
    }
}