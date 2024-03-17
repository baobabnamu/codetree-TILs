import java.util.*;

public class Main {
    private static final int MAX_N = 100;

    private static int[] line = new int[MAX_N + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n][2];

        for(int i = 0; i < n; i++) {
            input[i][0] = sc.nextInt(); // start
            input[i][1] = sc.nextInt(); // end
            for(int j = input[i][0]; j <= input[i][1]; j++) {
                line[j]++;
            }
        }


        for(int i = 0; i < n; i++) { // except line
            for(int j = input[i][0]; j <= input[i][1]; j++) {
                line[j]--;
            }

            for(int j = 1; j <= MAX_N; j++) {
                if(line[j] == n - 1) {
                    System.out.print("Yes");
                    return;
                }
            }

            for(int j = input[i][0]; j <= input[i][1]; j++) {
                line[j]++;
            }
        }

        System.out.print("No");
    }
}