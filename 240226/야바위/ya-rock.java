import java.io.*;
import java.util.*;

public class Main {
    private static boolean[] game = new boolean[3];
    private static int[][] inputData;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        inputData = new int[n][3];

        for(int i = 0; i < n; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            inputData[i][0] = Integer.parseInt(stk.nextToken());
            inputData[i][1] = Integer.parseInt(stk.nextToken());
            inputData[i][2] = Integer.parseInt(stk.nextToken());
        }

        int ans = 0;
        for(int i = 0; i < 3; i++) { // 조약돌 시작이 1번~3번 컵인 경우 완탐
            int res = 0;
            initGame();

            game[i] = true; // true : 조약돌 있는 컵

            for(int j = 0; j < n; j++) {
                int a = inputData[j][0] - 1; // index와 inputData 값 매칭
                int b = inputData[j][1] - 1;
                int c = inputData[j][2] - 1;

                changeCup(a, b);
                if(game[c]) res++;
            }
            ans = Math.max(ans, res);
        }

        System.out.print(ans);
    }

    private static void initGame() {
        for(int i = 0; i < 3; i++)
            game[i] = false;
    }

    private static void changeCup(int cup1, int cup2) {
        boolean tempCup = game[cup1];
        game[cup1] = game[cup2];
        game[cup2] = tempCup;
    }
}