import java.util.*;

public class Main {
    private static final int LENGTH = 3;

    private static int[][] space = new int[LENGTH][LENGTH];
    private static Set<Integer> answers = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 3x3 공간 입력 받기
        for(int i = 0; i < LENGTH; i++) {
            int input = sc.nextInt();
            space[i][0] = input / 100;
            space[i][1] = (input % 100) / 10;
            space[i][2] = input % 10;
        }

        // 2-1. 모든 공간을 순회하기
        int ans = 0;
        for(int i = 0; i < LENGTH; i++) {
            for(int j = 0; j < LENGTH; j++) {
                // 2-2. 순회할 때 check 하기 
                if(isWinnable(i, j)) ans++;
            }
        }

        System.out.print(answers.size());
    }
    private static boolean isWinnable(int x, int y) {
        // check 방법 : 현재 인덱스의 값을 기준으로 선을 그었을 때 중복되는 값이 있는가 == 승리? 확인
        // 선의 방향 : 상,하,좌,우,좌상,좌하,우상,우하
        int[] dirX = {0, 0, -1, 1, -1, -1, 1, 1};
        int[] dirY = {-1, 1, 0, 0, -1, 1, -1, 1};

        for(int i = 0; i < dirX.length; i++) {
            int nx = x + dirX[i];
            int ny = y + dirY[i];
            
            if(inRange(nx, ny) && inRange(nx + dirX[i], ny + dirY[i])) { // index error 체킹
                int baseNum = space[x][y];
                if( ((baseNum == space[nx][ny]) && (baseNum != space[nx + dirX[i]][ny + dirY[i]]))
                    || ((baseNum != space[nx][ny]) && (baseNum == space[nx + dirX[i]][ny + dirY[i]])) ) {
                    // System.out.println("x : " + x + ", y : " + y + ", baseNum : " + baseNum);
                    // System.out.println("baseNum + 1 : " + space[nx][ny] + ", baseNum + 2 : " + space[nx + dirX[i]][ny + dirY[i]] + ", baseNum : " + baseNum);
                    // System.out.println();
                    int answerComb = (baseNum * 100) + (space[nx][ny] * 10) + space[nx + dirX[i]][ny + dirY[i]];
                    answers.add(answerComb);
                }
            }
        }

        return false;
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < LENGTH && y >= 0 && y < LENGTH;
    }
}