import java.util.*;

public class Main {
    public static void main(String[] args) {
        // A 출발지 B 목적지 x -> y 텔레포트 y -> x 텔레포트 가능
        // 거리 계산 : |위치1 - 위치2| = 거리

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int x = sc.nextInt(); int y = sc.nextInt();

        // 1. A -> B까지 걸어가는 경우의 수
        int dist1 = Math.abs(a - b);
        // 2. A -> x 텔레포트 타서 y에서 B까지 걸어가는 경우의 수
        int dist2 = Math.abs(a - x) + Math.abs(b - y);
        // 3. A -> y 텔레포트 타서 x에서 B까지 걸어가는 경우의 수
        int dist3 = Math.abs(a - y) + Math.abs(b - x);

        int ans = Math.min(dist1, Math.min(dist2, dist3));
        System.out.print(ans);
    }
}