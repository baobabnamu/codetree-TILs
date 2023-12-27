import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr;

    public static int calcMax(int idx) {
        if(idx == 0) {
            return arr[idx];
        }

        return Math.max(calcMax(idx-1), arr[idx]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }

        int max = calcMax(n-1);
        System.out.print(max);
    }
}