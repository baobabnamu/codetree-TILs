import java.io.*;
import java.util.*;

public class Main {
    private static final int INT_MAX = Integer.MAX_VALUE;

    private static int MAX_P = 6;
    private static int[] persons = new int[MAX_P];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int totalSum = 0;
        for(int i = 0; i < MAX_P; i++) {
            persons[i] = Integer.parseInt(stk.nextToken());
            totalSum += persons[i];
        }

        int min = INT_MAX;
        for(int i = 0; i < MAX_P; i++) {
            for(int j = i + 1; j < MAX_P; j++) {
                for(int k = j + 1; k < MAX_P; k++) {
                    int sum = persons[i] + persons[j] + persons[k]; // 선택한 3개의 숫자의 합
                    min = Math.min(min, Math.abs((totalSum - sum) - sum)); // 숫자 6개 전체의 합 - 선택한 3개의 숫자의 합 = 선택하지 않은 숫자 3개의합
                }
            }
        }

        System.out.print(min);
    }
}