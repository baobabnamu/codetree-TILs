import java.io.*;
import java.util.*;
public class Main {
    private static int[] nums = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        nums[0] = 1;
        System.out.printf("%d ", nums[0]);
        nums[1] = n;
        System.out.printf("%d ", nums[1]);

        int index = 2;
        int num = 0;
        while(num <= 100) {
            num = nums[index - 2] + nums[index - 1];
            nums[index++] = num;
            System.out.printf("%d ", nums[index - 1]);
        }

    }
}