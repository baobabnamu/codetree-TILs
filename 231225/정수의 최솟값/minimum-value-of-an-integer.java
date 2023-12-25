import java.util.*;
import java.io.*;

public class Main {
    public static int calcMin(int a, int b, int c) {
        int minValue = Math.min(Math.min(a, b), c);
        return minValue;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int min = calcMin(a, b, c);
        System.out.print(min);
    }
}