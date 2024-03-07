import java.util.*;

public class Main {
    public static void main(String[] args) {
        // A = 3, B = 3, C = 4, D = 7인 경우
        // A, B, C, D, A + B, B + C, C + D, D + A, A + C, B + D, A + B + C, A + B + D, A + C + D, B + C + D, A + B + C + D를 나열
        // 3, 3, 4, 7, 6, 7, 11, 10, 7, 10, 10, 13, 14, 14, 17이 되므로 입력으로 주어진 set과 동일합니다.

        // 1. 15개의 정수를 입력 받고 정렬하기
        // - 3 3 4 6 7 / 7 7 10 10 10 / 11 13 14 14 17
        // 2. 5중 for문
            // 2-1) a : 1 ~ 40
            // 입력받은 배열과 비교할 배열 (15) 만들기
                // 2-2) b : 1 ~ 40
                    // 2-3) c : 1 ~ 40
                        // 2-4) d : 1 ~ 40
                        // 15개 경우의 수를 일일이 더하기
                        // 그 후 배열 정렬
                        
                        // 2-5) 두 배열이 같다면

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