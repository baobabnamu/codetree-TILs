import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr;
    
    public static int calcMid(int curLen) {
        Arrays.sort(arr, 0, curLen);
        return arr[curLen/2];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i-1] = temp;

            if(i%2==1) {
                System.out.printf("%d ", calcMid(i));
            }
        }
    }
}