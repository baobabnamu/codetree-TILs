import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;

    private static int n = 5;
    private static int[] persons = new int[n];
    private static boolean[] visited = new boolean[n];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            persons[i] = Integer.parseInt(stk.nextToken());
        }

        int ans = INT_MAX;
        boolean isDiff = false;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                int sum1 = persons[i] + persons[j];
                visited[i] = true;
                visited[j] = true;

                for(int k = 0; k < n; k++) {
                    for(int l = 0; l < n; l++) {
                        if(i == k || i == l || j == k || j == l || k == l) continue;
                        int sum2 = persons[k] + persons[l];
                        visited[k] = true;
                        visited[l] = true;

                        int sum3 = 0;
                        for(int m = 0; m < n; m++) {
                            if(!visited[m]) {
                                sum3 = persons[m];
                            }
                        }

                        if(sum1 != sum2 && sum2 != sum3 && sum1 != sum3) {
                            int[] sums = {sum1, sum2, sum3};
                            Arrays.sort(sums);
                            int temp = sums[2] - sums[0];
                            ans = Math.min(ans, temp);
                            isDiff = true;
                        }

                        visited[k] = false;
                        visited[l] = false;
                    }
                }

                visited[i] = false;
                visited[j] = false;
            }
        }

        if(!isDiff) ans = -1;
        System.out.print(ans);
    }
}