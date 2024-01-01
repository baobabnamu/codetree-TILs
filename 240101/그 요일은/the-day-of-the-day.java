import java.util.*;
import java.io.*;

public class Main {
    public static int calcDays(int m, int d) {
        int[] monthOfdays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = d;
        for(int i=1; i<m; i++) {
            days += monthOfdays[i];
        }

        return days;
    }

    public static int countWeekOfDays(int m1, int d1, int m2, int d2, String baseWeekOfDay) {
        int count = 0;
        int baseDays = calcDays(m1, d1);
        int compareDays = calcDays(m2, d2);
        String[] weekOfDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        for(int i=baseDays; i<=compareDays; i++) {
            int idx = (i-baseDays)%7; 
            if(weekOfDays[idx].equals(baseWeekOfDay)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        String baseWeekOfDay = br.readLine();

        System.out.printf("%d", countWeekOfDays(m1, d1, m2, d2, baseWeekOfDay));
    }
}