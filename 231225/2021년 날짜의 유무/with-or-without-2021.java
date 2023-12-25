import java.util.*;
import java.io.*;

public class Main {
    public static boolean checkMonth(int m, int d) {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(m <= 12 && months[m] >= d) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        if(checkMonth(m, d)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}