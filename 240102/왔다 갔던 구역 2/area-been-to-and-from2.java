import java.io.*;
import java.util.*;

public class Main {
    public static int offset = 1000;
    public static int[] lines = new int[2001];

    public static int count() {
        int cnt = 0;
        for(int i=0; i<lines.length - 1; i++) {
            if(lines[i] >= 2) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void location(int start, int end) {
        start += offset;
        end += offset;
        for(int i=start; i<end; i++) {
            lines[i] += 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int initPoint = 0;

        for(int i=0; i<n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int move = Integer.parseInt(stk.nextToken());
            String direction = stk.nextToken();

            int leftPoint = initPoint;
            int rightPoint = initPoint;

            if(direction.equals("L")) {
                leftPoint -= move;
                initPoint -= move;
            } else {
                rightPoint += move;
                initPoint += move;
            }

            location(leftPoint, rightPoint);
        }

        System.out.print(count());
    }
}