import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] xArr = new int[N];
        int[] yArr = new int[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(stk.nextToken());
            yArr[i] = Integer.parseInt(stk.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i = 1; i < N - 1; i++) {
            int xTemp = xArr[i];
            int yTemp = yArr[i];
            xArr[i] = xArr[i + 1]; // 다음 좌표 값과 동일하게 만듬으로써 이동 좌표 값 계산에 영향 가지 않도록 변경
            yArr[i] = yArr[i + 1]; // 0인 경우 원점과의 좌표 계산으로 인해 거리 값 계산에 문제 발생


            // 로직
            int distance = 0;
            for(int j = 0; j < N - 1; j++)
                distance += Math.abs(xArr[j] - xArr[j + 1]) + Math.abs(yArr[j] - yArr[j + 1]);
            System.out.println(distance);
            min = Math.min(min, distance);

            xArr[i] = xTemp;
            yArr[i] = yTemp;
        }

        System.out.print(min);
        // N개의 체크 포인트로 구성(1번 ~ N번 체크포인트)
        // 이때, 중간에 체크포인트 하나 건너뛸거임 (1번과 N번 제외)
        // 최소 거리는? 거리 계산 공식 -> 택시 거리 = |x1 - x2| + |y1 - y2|
        // 체크포인트 좌표는 겹칠 수 있으므로 해당 좌표에 모든 체크포인트가 아니라 하나만 넘어가도록 구성

        // 1. 1차원 배열 x, y 각각 입력 받기
        // 2. 배열의 인덱스는 1 ~ N - 1 만 순회하며 하나 건너뛴 것 중에 제일 짧은 거리를 완탐으로 갱신
    }
}