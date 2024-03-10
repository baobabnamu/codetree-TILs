import java.util.*;

public class Main {
    private static final int MAX_NUM = 1000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        int[] boombs = new int[n];
        for(int i = 0; i < n; i++) boombs[i] = sc.nextInt();
        int[] boombsCnt = new int[MAX_NUM + 1];
        boolean[] explodes = new boolean[n];

        int maxVal = 1;
        int maxIdx = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(j - i > k) break;
                if(boombs[i] != boombs[j]) continue;
                
                if(explodes[i] == false) {
                    boombsCnt[boombs[i]]++;
                    explodes[i] = true;
                }

                if(explodes[j] == false) {
                    boombsCnt[boombs[j]]++;
                    explodes[j] = true;
                }
            }
        }

        for(int i = 0; i <= MAX_NUM; i++) {
            if(maxVal <= boombsCnt[i]) {
                maxVal = boombsCnt[i];
                maxIdx = i;
            }
        }

        System.out.print(maxIdx);
    }
}