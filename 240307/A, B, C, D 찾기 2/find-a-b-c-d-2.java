import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] baseNums = new int[15];
        for(int i = 0; i < 15; i++) baseNums[i] = sc.nextInt();
        Arrays.sort(baseNums);

        for(int a = 1; a <= 40; a++) {
            for(int b = 1; b <= 40; b++) {
                for(int c = 1; c <= 40; c++) {
                    for(int d = 1; d <= 40; d++) {
                        int[] compNums = {
                            a, b, c, d, 
                            a + b, b + c, c + d, d + a, a + c, b + d, 
                            a + b + c, a + b + d, a + c + d, b + c + d, 
                            a + b + c + d
                        };
                        Arrays.sort(compNums);

                        if(isEqualNums(baseNums, compNums)) {
                            System.out.printf("%d %d %d %d", a, b, c, d);
                            return;
                        }
                    }
                }
            }
        }

    }

    private static boolean isEqualNums(int[] baseNums, int[] compNums) {
        for(int i = 0; i < 15; i++) {
            if(baseNums[i] != compNums[i]) {
                return false;
            }
        }

        return true;
    }
}