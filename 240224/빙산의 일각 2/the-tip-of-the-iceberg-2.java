import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] iceBergs = new int[n + 1];
        int start = 1001;
        int end = 0;

        for(int i = 1; i <= n; i++) {
            iceBergs[i] = Integer.parseInt(sc.nextLine());
            start = Math.min(start, iceBergs[i]);
            end = Math.max(end, iceBergs[i]);
        }

        int ans = 0;
        
        for(int i = start; i <= end; i++) {
            int cnt = 0;

            for(int j = 1; j <= n; j++) {    
                if(iceBergs[j - 1] <= i && iceBergs[j] > i) cnt++;
                    
            }
            ans = Math.max(ans, cnt);
        }
        System.out.print(ans);
    }
}