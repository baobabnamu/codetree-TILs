import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[][] hopeProduct = new int[n][b];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                hopeProduct[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(hopeProduct, Comparator.comparingInt(a -> IntStream.of(a).sum()));

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            int student = 0;
            for(int j = 0; j < n; j++) {
                int tmp = 0;
                if(i == j) {
                    tmp = (hopeProduct[j][0] / 2) + hopeProduct[j][1];
                } else {
                    tmp = hopeProduct[j][0] + hopeProduct[j][1];
                }

                if(sum + tmp <= b) {
                    student++;
                    sum += tmp;
                } else {
                    break;
                }
            }
            ans = Math.max(ans, student);
        }

        System.out.print(ans);
    }
}