import java.util.*;

public class Main {
    private static final int MAX_K = 10;
    private static final int MAX_N = 20;

    private static int K, N;
    private static int[][] arr = new int[MAX_K][MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();

        for(int i = 0; i < K; i++) {
            for(int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int pair = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if(i == j) continue;

                // i번 개발자가 j번 개발자보다 높은 순위일때 true
                boolean correct = true;

                for(int x = 0; x < K; x++) {
                    int indexI = 0, indexJ = 0;

                    for(int y = 0; y < N; y++) {
                        if(arr[x][y] == i) indexI = y;
                        if(arr[x][y] == j) indexJ = y;
                    }

                    if(indexI > indexJ) correct = false;
                }

                if(correct) pair++;
            }
        }

        System.out.print(pair);
    }
}