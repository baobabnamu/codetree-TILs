import java.util.*;

public class Main {
    private static final int MAX_N = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[7];
        for(int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();
        Arrays.sort(nums);

        
        int a = nums[0]; int b = nums[1]; int abc = nums[6];
        int ab = a + b;
        int c = abc - ab;
        
        System.out.print(a + " " + b + " " + c);
    }
}