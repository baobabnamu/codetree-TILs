import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        // arr input, n = rowSize / m = colSize
        int[][] arr = new int[n][m];
        int temp;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                temp = Integer.parseInt(st.nextToken());
                arr[i][j] = temp;
            }
        }
        
        // compare
        int[][] compareArr = new int[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                temp = Integer.parseInt(st.nextToken());
                compareArr[i][j] = temp == arr[i][j] ? 0 : 1;
                System.out.printf("%d ", compareArr[i][j]);
            }
            System.out.println();
        }
    }
}