import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }

        Arrays.sort(arr);
        Integer[] arrRev = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrRev, Collections.reverseOrder());

        for(int a : arr) {
            System.out.printf("%d ", a);
        }
        System.out.println();
        for(int a : arrRev) {
            System.out.printf("%d ", a);
        }
    }
}