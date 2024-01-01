import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        int[] month_of_days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(m1==m2) {
            System.out.printf("%d", d2 - (d1 - 1));
        } else {
            int result = month_of_days[m1] - (d1 - 1);
            for(int i=m1+1; i<=m2-1; i++) {
                result += month_of_days[i];
            }
            result += d2;
            System.out.printf("%d", result);
        }    
        
    }
}