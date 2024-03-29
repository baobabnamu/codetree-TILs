import java.util.*;

public class Main {
    private static final int MAX_N = 20;

    private static int[] space;
    private static int n, peopleCnt = 0;

    public static void main(String[] args) {
        // 최대한의 거리두기를 실행한 간격을 출력
        // #1 현재 있는 사람들의 자리는 그대로 유지해야 함.
        // #2 이때 '간격'은 두 사람이 떨어져있는 칸의 수를 말함.
        // #3 모든 좌석의 개수는 N개이며 좌석의 공석 여부(0 : 공석, 1 : 공석아님)는 임.
        // #Tip1 : 최대한의 거리두기 = 한 명을 더 집어넣었을 때 가장 가까운 두 사람 간의 거리를 말함.

        // 로직
        // 1. 독서실 공간 입력 받기
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        space = new int[n];
        String spaceValues = sc.next();
        for(int i = 0; i < n; i++) {
            int index = Integer.parseInt(spaceValues.substring(i, i + 1));
            space[i] = index;
            if(space[i] == 1) peopleCnt++;
        }

        // 2. 독서실 완탐
            // 2-1. i : 0번 자리 ~ n - 1번 자리까지 반복
            //      i번 자리가 공석인 경우에만 2-2 로 넘어감
            // 2-2. 가장 가까운 사람의 거리를 구하는 함수 호출
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(space[i] == 0) {
                space[i] = 1;
                int distance = calcDistance();
                ans = Math.max(ans, distance);
                space[i] = 0;
            }
        }

        System.out.print(ans);
    }

    private static int calcDistance() {
        int[] indexes = new int[peopleCnt + 1];
        int index = 0;

        for(int i = 0; i < n; i++) {
            if(space[i] == 1)
                indexes[index++] = i;
        }

        int res = MAX_N;
        for(int i = 0; i < indexes.length - 1; i++) {
            int distance = indexes[i + 1] - indexes[i];
            res = Math.min(res, distance);
        }

        return res;
    }
}