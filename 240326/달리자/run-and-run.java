import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] orgArr = new int[n];
        int[] resArr = new int[n];

        for(int i = 0; i < n; i++) orgArr[i] = sc.nextInt();
        for(int i = 0; i < n; i++) resArr[i] = sc.nextInt();

        int ans = 0;
        for(int i = 0; i < n - 1; i++) {
            int diff = orgArr[i] - resArr[i];
            orgArr[i] -= diff;
            orgArr[i + 1] += diff;
            ans += diff;
        }

        System.out.print(ans);
    }
}