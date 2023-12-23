import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int diff = 100;
        int temp;
        int[] arr = new int[n];

        // arr input
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }

        // compare
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(i != j) {
                    temp = Math.abs(arr[i]-arr[j]);
                    diff = Math.min(diff, temp);
                } else {
                    continue;
                }
            }
        }

        // print
        System.out.print(diff);
    }
}