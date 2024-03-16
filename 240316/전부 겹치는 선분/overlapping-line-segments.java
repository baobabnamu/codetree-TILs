import java.util.*;

public class Main {
    private static final int MAX_N = 100;

    private static int[] line = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            cnt++;
            for(int x = x1; x <= x2; x++) {
                line[x]++;
            }
        }

        for(int i = 1; i <= MAX_N; i++) {
            if(line[i] == cnt) {
                System.out.print("Yes");
                return;
            }
        }

        System.out.print("No");
    }
}