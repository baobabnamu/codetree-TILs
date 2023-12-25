import java.util.*;
import java.io.*;

public class Main {
    public static void calcArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i] %2 == 0 ? arr[i] / 2 : arr[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        int temp;
        for(int i=0; i<n; i++) {
            temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }

        calcArray(arr);

        for(int a : arr) {
            System.out.printf("%d ", a);
        }
    }
}