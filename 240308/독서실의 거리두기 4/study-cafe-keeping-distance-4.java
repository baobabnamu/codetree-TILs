import java.util.*;

public class Main {

    private static int n;
    private static int[] space;

    public static void main(String[] args) {
        // 아이디어 : 비어있는 좌석에 일일이 사람 앉혀보기
        // 이때, 앉힌 후에 좌석 현황을 인덱스로 따로 배열 뺀다음
        // 그 배열에서 옆 자리랑 빼면서 최대 거리 값 갱신하기

        Scanner sc = new Scanner(System.in);
        // 1. 좌석 입력 받기
        n = sc.nextInt();
        space = new int[n];
        String inputData = sc.next();
        for(int i = 0; i < n; i++) space[i] = inputData.charAt(i) - 48;

        // 2. 입력받은 좌석 배열 중 비어있는 좌석의 인덱스 값을 조사
        int[] emptyIndexs = new int[n];
        int emptyIndexsSize = 0;
        for(int i = 0; i < n; i++) {
            if(space[i] == 0) {
                emptyIndexs[emptyIndexsSize++] = i;
            }
        }

        // 3. 인덱스 값을 기준으로 이중 for문 하기
            // 3-1) i : 1번째 사람이 앉을 곳
        int ans = 0;
        for(int i = 0; i < emptyIndexsSize; i++) {
            int index1 = emptyIndexs[i];
            space[index1] = 1;
            for(int j = i + 1; j < emptyIndexsSize; j++) {
                int index2 = emptyIndexs[j];
                space[index2] = 1;
                int distance = calcDistance();
                ans = Math.max(ans, distance);
                space[index2] = 0;
            }
            space[index1] = 0;
        }

        System.out.print(ans);
            // 배열에 i 자리에 표시
                // 3-2) j : 2번째 사람이 앉을 곳
                // 배열에 j 자리에 표시
                // i, j에 사람이 앉았을 때 거리값 구하는 함수 호출
                // 거리 값, ans 중 max 갱신
                // 배열에 표시했던 j 제거
            // 배열에 표시했던 i 제거
        
    }

    private static int calcDistance() {
        int[] sitedIndexes = new int[n];
        int sitedIndexesSize = 0;
        for(int i = 0; i < n; i++) {
            if(space[i] == 1) {
                sitedIndexes[sitedIndexesSize++] = i;
            }
        }

        int distance = 101;
        for(int i = 1; i < sitedIndexesSize; i++) {
            distance = Math.min(sitedIndexes[i] - sitedIndexes[i - 1], distance);
        }

        return distance;
    }
        // 함수. 거리값 구하기
        // 1. 앉아있는 자리들을 인덱스로 따로 뺀 후 바로 옆자리랑 빼면서 최소 거리값 갱신하기
}