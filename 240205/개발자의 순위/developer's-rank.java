import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(stk.nextToken());
        int n = Integer.parseInt(stk.nextToken());

        int[][] numArrs = new int[k][n];

        for(int i = 0; i < k; i++) {
            stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                numArrs[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int pair = 0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i == j){
                    continue;
                }
                int cnt = 0;
                for(int k = 0 ; k < numArrs.length ; k++){
                    int i_idx = -1;
                    int j_idx = -1;
                    for(int h = 0 ; h < numArrs[k].length ; h++){
                        if(numArrs[k][h] == i){
                            i_idx = h;
                        }
                        else if(numArrs[k][h] == j){
                            j_idx = h;
                        }
                    }
                    if(i_idx > j_idx){
                        cnt++;
                    }
                }
                if(cnt == numArrs.length){
                    pair++;
                }
            }
        }
        System.out.print(pair);
    }
}