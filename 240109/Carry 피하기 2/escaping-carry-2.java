import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for(int i = 0; i < n; i++)
            nums[i] = Integer.parseInt(br.readLine());

        int max = -1;
        for(int i = 0; i < n; i++) {
            int baseNum = nums[i];
                for(int j = 0; j < n; j++) {
                    if(i != j && !isCarry(nums[i], nums[j])) {
                        int tempNums = nums[i] + nums[j];
                        for(int k = 0; k < n; k++) {
                            if(i != k && j != k && !isCarry(tempNums, nums[k])) {
                                max = Math.max(max, tempNums + nums[k]);
                            }  
                       }
                    }
                }
        }

        System.out.print(max);

        // 캐리 발생 여부 함수를 for문 마다 if문으로 조건 걸기.
        // 캐리 발생 안한 값이 산출될 때마다 max 값 갱신하기.
        // max 값의 초기 값은 -1로.
    }

    public static boolean isCarry(int n1, int n2) {
        while(n1 != 0 || n2 != 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;

            int sum = digit1 + digit2;

            if(sum >= 10) return true;

            n1 /= 10;
            n2 /= 10;
        }

        return false;
    }
}