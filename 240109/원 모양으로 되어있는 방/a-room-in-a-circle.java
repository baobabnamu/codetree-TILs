import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rooms = new int[N];

        for(int i = 0; i < N; i++)
            rooms[i] = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            int startRoom = i;
            int distance = 0;
            for(int j = 0; j < N; j++) {
                int curRoom = (startRoom + j) % 5;
                distance += rooms[curRoom] * j;               
            }
            min = Math.min(min, distance);
        }

        System.out.print(min);
        // 어떤 방을 시작으로 해야 거리의 합을 최소화 할 수 있는가?
        // 방향은 시계 반대 방향(왼쪽)

        // 1. 방 인원 배열 입력 받기
        // 2. 시작 위치를 1 -> 방 크기까지 순회해서 완탐 비교
        // 시작 위치에서 모든 인원이 출발한다고 가정.
        // 시작 위치를 외부 for문에서 시작 위치 기준으로 값 계산으로 내부 for문에서 처리
        // 외부 for문 반복 시 startRoom = 1 ~ 5 
        // 내부 for문은 반복 변수에는 그냥 N번만큼 반복하게 하고 변수로 따로 startRoom 관리 만약 5를 넘으면 1로 넘어가도록
        // 3. 그리고 완탐으로 최소 값 갱신
    }
}