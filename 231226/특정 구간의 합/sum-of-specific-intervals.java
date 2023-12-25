import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr;

    public static int magicCalc(int start, int end) {
        int result = 0;
        for(int i=start-1; i<end; i++) {
            result += arr[i];
        }
        return result; 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp; 
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int result = magicCalc(start, end);
            System.out.println(result);
        }
    }
}