import java.util.*;
import java.io.*;

public class Main {
    public static boolean isLeapYear(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int seasonCalc(int y, int m, int d) {
        int[] yearMonthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        yearMonthDays[2] = isLeapYear(y) ? yearMonthDays[2]+1 : yearMonthDays[2];

        if(yearMonthDays[m] >= d) {
            if(m >= 3 && m <= 5) {
                return 1;
            } else if (m >= 6 && m <= 8) {
                return 2;
            } else if (m >= 9 && m <= 11) {
                return 3;
            } else if (m == 1 || m == 2 || m == 12) {
                return 4;
            }
        }

        return 0;
    }

    public static void printSeason(int y, int m, int d) {
        String[] seasons = {"-1", "Spring", "Summer", "Fall", "Winter"};
        int seasonIdx = seasonCalc(y, m, d);
        System.out.print(seasons[seasonIdx]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        printSeason(y, m, d);
    }
}