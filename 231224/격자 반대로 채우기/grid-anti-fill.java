import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] dx = {-1, 1};
        int[][] arr = new int[n][n];

        // arr input
        int curRow = n-1;
        int curCol = n-1;
        int number = 1;
        int dirIdx = 0;
        arr[curRow][curCol] = number;
   
        while(true) {
            number++;
            if(number > n*n || n == 1) {
                break;
            }

            curRow += dx[dirIdx];
            
            if(curRow >= 0 && curCol >= 0 && curRow < n && curCol < n) {
                arr[curRow][curCol] = number;
            }

            if(curRow <= 0 || curRow >= n-1) {
                curCol = curCol > 0 ? curCol - 1 : curCol;
                number = number >= n*n ? number : number+1;
                arr[curRow][curCol] = number;
                dirIdx = curRow <= 0 ? 1 : 0;
            }
        }

        // arr print
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}