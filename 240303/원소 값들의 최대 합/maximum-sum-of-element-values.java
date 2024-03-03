import java.util.*;

public class Main {
    private static int n, m;
    private static int[] numArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        numArr = new int[n + 1];

        for(int i = 1; i <= n; i++)
            numArr[i] = sc.nextInt();

        int ans = 0;
        for(int i = 1; i < n; i++) {
            int sum = move(i, m, 0);
            ans = Math.max(ans, sum);
        }

        System.out.print(ans);
    }

    private static int move(int index, int loop, int sum) {
        int nextIndex = numArr[index];
        sum += nextIndex;
        if(loop <= 1) return sum;       

        return move(nextIndex, loop - 1, sum);
    }
}