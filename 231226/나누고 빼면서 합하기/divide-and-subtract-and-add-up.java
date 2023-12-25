import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr;

    public static int magicCalc(int m) {
        int result = 0;

        while(m != 1) {
            result += arr[m-1];
            if(m%2 == 1) {
                m -= 1;
            } else {
                m /= 2;
            }
        }

        return result + arr[0];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        int temp;
        for(int i=0; i<n; i++) {
            temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }

        int result = magicCalc(m);
        System.out.printf("%d", result);
    }
}