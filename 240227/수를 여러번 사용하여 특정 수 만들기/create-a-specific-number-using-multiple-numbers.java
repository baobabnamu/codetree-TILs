import java.util.*;

public class Main {
    public static void main(String[] args) {
        // A와 B를 여러 번 사용할 수 있고, 사용한 숫자들의 합이 C보다 작거나 같게 최대 값을 구하여라.
        // 1. A 1번 쓸 때
            // 1-1. B 1번 쓸 때
            // 1-2. B 2번 쓸 때
            // 1-3. B n번 쓸 때
            // break 조건 : A + B >= C
        // 2. A 2번 쓸 때
            // 위와 동일
            
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = 0;
        for(int i = 1; (a * i) <= c; i++) {
            int res = 0;

            for(int j = 1; (a * i) + (b * j) <= c; j++)
                res = (a * i) + (b * j);

            ans = Math.max(ans, res);
        }

        System.out.print(ans);
    }
}