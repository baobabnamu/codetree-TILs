import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;

    private static int MAX_P = 6;
    private static int[] persons = new int[MAX_P];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < MAX_P; i++) {
            persons[i] = Integer.parseInt(stk.nextToken());
        }

        int min = INT_MAX;
        for(int i = 0; i < MAX_P; i++) {
            for(int j = i + 1; j < MAX_P; j++) {
                for(int k = j + 1; k < MAX_P; k++) {
                    int sumA = 0, sumB = 0;
                    boolean[] visited = new boolean[MAX_P];

                    sumA += persons[i] + persons[j] + persons[k];
                    visited[i] = true; visited[j] = true; visited[k] = true;
                    
                    for(int l = 0; l < MAX_P; l++) {
                        if(!visited[l]) {
                            sumB += persons[l];
                        }
                    }

                    min = Math.min(min, Math.abs(sumA - sumB));
                }
            }
        }

        System.out.print(min);
    }
}