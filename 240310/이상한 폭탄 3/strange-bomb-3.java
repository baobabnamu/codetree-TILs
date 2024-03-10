import java.util.*;
public class Main {
    private final static int MAX_NUMBER = 1000000;
    private final static int MAX_N = 100;

    private static int n, k, cnt;
    private static int[] boombs;

    public static void main(String[] args) {
        // 폭탄 N개가 주어짐
        // 정수 값이 같은 폭탄끼리의 거리가 K 안에 있으면 폭발
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        boombs = new int[n];
        for(int i = 0; i < n; i++) boombs[i] = sc.nextInt();

        // 아이디어 : 완탐으로 하나하나 터지는 걸 계산해보기
        // 1) i : 폭탄 배열을 순회
        // ans : Math.max(ans, 7번이 터질 때의 터지는 폭탄 개수를 구하는 함수 호출)
        // TC :
        // 0이 1개만 들어오는 경우
        // 폭탄의 번호가 최댓값인 경우
        // 연달아 폭탄이 터지는 경우
        int ans = 0;
        int max = 1;
        for(int i = 0; i < n; i++) {
            boolean[] useBoombs = new boolean[n];
            cnt = 0;
            coutingBomb(boombs[i], i, useBoombs);
            // System.out.printf("boomb[%d] : %d, cnt : %d\n" , i, boombs[i], cnt);
            if(max < cnt) {
                ans = boombs[i];
                max = cnt;
            } 
            else if(max == cnt && ans < i && ans != 0) {
                ans = boombs[i];
            }
        }
        System.out.print(ans);
    }

    // 터진 곳을 기점으로 더 순회해야 됨.
    private static void coutingBomb(int boomb, int index, boolean[] useBoombs) { // 2, 1, boolean[]
        for(int i = index; i <= i + k; i++) {
            if(i >= n) break;
            if(boombs[i] == boomb && !useBoombs[i]) {
                cnt++;
                useBoombs[i] = true;
                coutingBomb(boombs[i] + 1, index + 1, useBoombs);
            }
        }
    }
}