import java.util.*;

public class Main {
    private static final int MAX_N = 1000000000;

    public static void main(String[] args) {
        // A, 
        // B, 
        // C, 
        // A + B, 
        // B + C,
        // C + A,
        // A + B + C
        // 가 랜덤으로 7개가 첫 번째 줄에 주어진다.
        // 이때, a <= b <= c 라고 가정했을 때 a, b, c의 값을 구하여라.
        // 일단 제일 작은 값이 a
        // 그다음 작은 값이 b
        // base랑 비교해보기

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[7];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        int a = nums[0]; int b = nums[1];
        
        int[] compNums = new int[7];
        for(int c = b; c <= MAX_N; c++) {
            compNums[0] = a;
            compNums[1] = b;
            compNums[2] = c;
            compNums[3] = a + b;
            compNums[4] = b + c;
            compNums[5] = c + a;
            compNums[6] = a + b + c;
            Arrays.sort(compNums);

            boolean flag = true;
            for(int i = 0; i < compNums.length; i++) {
                if(nums[i] != compNums[i]) {
                    flag = false;
                    break;
                }
            }  

            if(flag) {
                System.out.print(a + " " + b + " " + c);
                return;
            }
        }
    }
}