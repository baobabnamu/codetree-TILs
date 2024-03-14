import java.util.*;

public class Main {
    private static final int MAX_N = 100;

    private static int[] area = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int d = sc.nextInt();

        // System.out.print(a + " " + b + " " + c + " " + d + " ");

        for(int i = a; i < b; i++) area[i] = 1;
        for(int i = c; i < d; i++) area[i] = 1;

        int cnt = 0;
        for(int el : area) {
            if(el == 1) cnt++;
        }

        System.out.print(cnt);

    }
}