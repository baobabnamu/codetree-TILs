import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = 4;
        int[][] arr = new int[n][n];
        

        // arr input
        int temp;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                temp = Integer.parseInt(st.nextToken());
                arr[i][j] = temp;
            }
        }

        // arr calc
        int sum = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                sum += arr[i][j];
            }
        }

        System.out.print(sum);
    }
}