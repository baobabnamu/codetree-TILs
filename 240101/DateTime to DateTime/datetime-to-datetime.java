import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // 1h = 60
        // 1d = 60*24
        int start = (60*24*11) + (60*11) + 11;
        int end = (60*24*a) + (60*b) + c;

        if(end < start) {
            System.out.printf("%d", -1);
        } else {
            System.out.printf("%d", (end-start));
        }
    }
}