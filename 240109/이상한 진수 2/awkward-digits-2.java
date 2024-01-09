import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        int[] nums = new int[len];
        boolean isFind = false;    

        for(int i = 0; i < len; i++) {
            if(!isFind && s.charAt(i) == '0') {
                nums[i] = 1;
                isFind = true;
            } else if(i == len - 1 && !isFind && s.charAt(i) != '0') {
                nums[i] = 0;
            } else {
                nums[i] = s.charAt(i) - 48;
            }
        }

        int ans = 0;
        int power = 0;
        for(int i = len - 1; i >= 0; i--) {
            int num = nums[i]; // 숫자 변환
            if(num == 1) {
                ans += Math.pow(2, power);
            }
            power++;
        }

        System.out.print(ans);
        // 1. 완탐
        // for문 돌면서 0 만나면 1로 변경
        // 마지막 인덱스인데도 만약 0을 한 번도 만나지 못했다면 마지막 1를 0으로 변경

        // 2. 2진수로 변환
    }
}