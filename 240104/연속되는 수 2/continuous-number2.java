import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for(int i=0; i<n; i++) 
            nums[i] = Integer.parseInt(br.readLine());

        int cnt = 0;
        int ans = 1;
        for(int i=0; i<n; i++) {
            if(i == 0 || nums[i] == nums[i-1]) cnt++;
            else if(nums[i] != nums[i-1]) cnt = 1;
            ans = Math.max(cnt, ans);
        }
            
        System.out.print(ans);
    }
}