import java.util.*;

public class Main {
    private static int n;
    private static int[] aArr, bArr;
    public static void main(String[] args) {
        // 양의 정수 x를 찾아라
        // x로 시작해서 2를 n번 곱한다
        // 이때 숫자의 범위에 대한 단서가 주어진다.
        // 단서 : ai <= x <= bi 이다.

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        aArr = new int[n];
        bArr = new int[n];


        for(int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
            bArr[i] = sc.nextInt();
        }

        int ans = 0;
        for(int x = 1; x <= 10000; x++)
            if(isSatisfied(x)) 
                ans = x;

        System.out.print(ans);
    }

    private static boolean isSatisfied(int x) {
        for(int i = 0; i < n; i++) {
            x *= 2;
            if(aArr[i] > x || bArr[i] < x) 
                return false;
        }

        return true;
    }
}