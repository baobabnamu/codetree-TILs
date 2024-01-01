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

        int[] monthOfDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekOfDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int days1 = 0;
        int days2 = 0;
        for(int i=1; i<12; i++) {
            if(i < m1) days1 += monthOfDays[i];
            if(i < m2) days2 += monthOfDays[i];
        }
        days1 += d1;
        days2 += d2;

        int diff = days2 - days1;

        if(diff <= 0) {
            if(diff % 7 == 0) {
                System.out.printf("%s", weekOfDays[0]);
            } else {
                System.out.printf("%s", weekOfDays[7 - (Math.abs(diff) % 7)]);
            }
        } else {
            System.out.printf("%s", weekOfDays[diff%7]);
        }
    }
}