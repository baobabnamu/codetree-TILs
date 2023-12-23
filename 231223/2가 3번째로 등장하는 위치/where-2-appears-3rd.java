import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int temp;

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            temp = Integer.parseInt(st.nextToken());
            if(temp == 2) {
                cnt++;
            }
            if(cnt == 3) {
                System.out.print(i);
                break;
            }
        }

    }
}