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
                for(int j = i + 1; j < n; j++) {
                    if(!isCarry(nums[i], nums[j])) {
                        int tempNums = nums[i] + nums[j];
                        for(int k = j + 1; k < n; k++) {
                            if(!isCarry(tempNums, nums[k]))
                                max = Math.max(max, tempNums + nums[k]);
                       }
                    }
                }
        }

        System.out.print(max);
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