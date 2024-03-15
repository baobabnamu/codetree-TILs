import java.util.*;

public class Main {
    private static final int MAX_N = 100;

    private static int[][] space = new int[MAX_N + 1][MAX_N + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); int y1 = sc.nextInt(); int x2 = sc.nextInt(); int y2 = sc.nextInt();
        int a1 = sc.nextInt(); int b1 = sc.nextInt(); int a2 = sc.nextInt(); int b2 = sc.nextInt();

        for(int x = x1; x <= x2; x++) {
            for(int y = y1; y <= y2; y++) {
                space[x][y]++;
            }
        }

        for(int a = a1; a <= a2; a++) {
            for(int b = b1; b <= b2; b++) {
                space[a][b]++;
            }
        }

        boolean overlapped = false;
        for(int i = 1; i <= MAX_N; i++) {
            for(int j = 1; j <= MAX_N; j++) {
                if(overlapped) {
                    System.out.print("overlapping");
                    return;
                }

                if(space[i][j] > 1) {
                    overlapped = true;
                }
            }
        }

        System.out.print("nooverlapping");
    }
}